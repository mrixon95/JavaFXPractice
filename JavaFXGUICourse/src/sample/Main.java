package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("icon.jpg"); // will look in your src folder. Hence only need file name
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("WOOWWW TITLE BLAH");
        primaryStage.setWidth(420);
        primaryStage.setHeight(620);
        primaryStage.setResizable(false);
//        primaryStage.setX(50);
//        primaryStage.setY(50);
        //primaryStage.setFullScreen(true);
        //primaryStage.setFullScreenExitHint("You can't escape unless you pres q");
        //primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
