package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    GridPane myGridPane;

    @FXML
    Label myLabel;

    @FXML
    ChoiceBox<String> myChoiceBox;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().add("Pizza");
        myChoiceBox.getItems().add("Sushi");
        myChoiceBox.getItems().add("Ramen");
        myChoiceBox.setOnAction(e -> {
            String chosenValue = myChoiceBox.getValue();
            myLabel.setText(chosenValue);
        });
    }
}
