package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // web view is in charge of displaying the contents of a web engine

    @FXML
    private WebView webview;

    @FXML
    private TextField textField;

    private WebEngine engine;

    private String homePage;

    private double webZoom;

    private WebHistory history;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = webview.getEngine();
        homePage = "www.google.com";
        textField.setText(homePage);
        webZoom = 1;
        loadPage();
    }

    public void loadPage() {
        engine.load("http://" + textField.getText());
    }

    public void refreshPage() {
        engine.reload();
    }


    public void zoomIn() {
        webZoom += 0.25;
        webview.setZoom(webZoom);
    }

    public void zoomOut() {
        webZoom -= 0.25;
        webview.setZoom(webZoom);
    }

    public void history() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        for (WebHistory.Entry entry: entries) {
            System.out.println(entry);
        }
    }

    @FXML
    public void back() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(-1);
        String currentUrl = entries.get(history.getCurrentIndex()).getUrl();
        textField.setText(currentUrl);
    }

    @FXML
    public void forward() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(1);
        String currentUrl = entries.get(history.getCurrentIndex()).getUrl();
        textField.setText(currentUrl);
    }

    public void executeJS() {
        engine.executeScript("window.location = \"https://www.youtube.com\"");
    }



}
