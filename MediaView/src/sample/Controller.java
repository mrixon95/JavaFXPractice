package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private MediaView mediaView;
    // MediaView is a port in which we display media or another source
    // Web view displays the contents of a web enginge

    @FXML
    private Button playButton, pauseButton, resetButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("myVideo.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
    }

    @FXML
    public void playMedia() {
        mediaPlayer.play();
    }

    @FXML
    public void pauseMedia() {
        mediaPlayer.pause();
    }

    @FXML
    public void resetMedia() {
        if (mediaPlayer.getStatus() != MediaPlayer.Status.READY)
        {
            mediaPlayer.seek(Duration.seconds(0.0));
        }
    }

}
