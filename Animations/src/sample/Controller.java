package sample;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private ImageView myImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(myImage);
//        translate.setDuration(Duration.millis(1000));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByX(250);
//        translate.setByY(-250);
//        translate.setAutoReverse(true);
//        translate.play();

//        RotateTransition translate = new RotateTransition();
//        translate.setNode(myImage);
//        translate.setDuration(Duration.millis(1000));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByAngle(270);
//        translate.setInterpolator(Interpolator.LINEAR);
//        translate.setAutoReverse(true);
//        translate.setAxis(Rotate.X_AXIS);
//        translate.play();
//
//        FadeTransition translate = new FadeTransition();
//        translate.setNode(myImage);
//        translate.setDuration(Duration.millis(500));
//        translate.setFromValue(1);
//        translate.setToValue(0.2);
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setInterpolator(Interpolator.LINEAR);
//        translate.setAutoReverse(true);
//        translate.play();



        ScaleTransition translate = new ScaleTransition();
        translate.setNode(myImage);
        translate.setDuration(Duration.millis(500));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setInterpolator(Interpolator.LINEAR);
        translate.setByY(0.9);
        translate.setAutoReverse(true);
        translate.play();



    }
}
