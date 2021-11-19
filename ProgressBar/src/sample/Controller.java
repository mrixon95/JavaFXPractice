package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private Button myButton;

    @FXML
    private Label myLabel;

    // The BigDecimal class gives its user complete control over rounding behavior
    private BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myProgressBar.setStyle("-fx-accent: red;");
    }

    public void onProgress() {
        if (progress.doubleValue() < 1) {
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText(Double.toString((int) Math.round(progress.doubleValue() * 100))+ "%");

        }

    }



}
