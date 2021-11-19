package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            event.consume(); // It won't be processed in the default manner by the source which it originated from
            // you don't want the evwent to be handled by any other event listeners.
            logout(primaryStage);

        });
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before exiting");

        if(alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You successfully logged out");
            stage.close();
        }



    }


}
