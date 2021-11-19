package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    // ImageView is a Node used for painting images loaded with Images
    // ImageView is our picture frame which we can change with different images

    @FXML
    ImageView myImageView;
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("Shrek2.jpg"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }

}
