package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private Label myLabel;

    @FXML
    private RadioButton pizzaButton;

    @FXML
    private RadioButton sushiButton;

    @FXML
    private RadioButton ramenButton;

    ToggleGroup group;

    @FXML
    public void initialize() {
        System.out.println("Initailise the thing");
        group = new ToggleGroup();
        pizzaButton.setToggleGroup(group);
        pizzaButton.setSelected(true);

        sushiButton.setToggleGroup(group);
        ramenButton.setToggleGroup(group);
    }

    public void changeFood(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
        String text = selectedRadioButton.getText();
        myLabel.setText(text);

    }



}
