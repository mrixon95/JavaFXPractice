package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Controller {

    @FXML
    private DatePicker myDatePicker;

    @FXML
    private Label myLabel;

    @FXML
    public void initialize() {
        myDatePicker.setOnAction(e -> changeDate());

    }

    public void changeDate() {

        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
        myLabel.setText(myFormattedDate);
    }


}
