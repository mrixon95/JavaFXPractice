package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
//        // FXML loader will inject all of the values in the fxml file, into the controller class
//        primaryStage.setTitle("Hello World");
//        Scene scene = new Scene(root, 300, 275);
//        // link css style sheet to scene
//        String css = this.getClass().getResource("application.css").toExternalForm();
//        scene.getStylesheets().add(css);
//        primaryStage.setScene(scene);
//        primaryStage.show();

        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
