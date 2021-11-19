package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TreeView<String> myTreeView;

    @FXML
    public void selectItem() {

        TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();
        if (item != null) {
            System.out.println(item.getValue());
        }

    }

    // need treeitems for the treeview
    // add children to the root item
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TreeItem<String> rootItem = new TreeItem<>("Files", new ImageView(new Image("file.png", 10, 10,false, false)));
        TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> branchItem3 = new TreeItem<>("Music");

        TreeItem<String> leafItem1 = new TreeItem<>("Picture1");
        TreeItem<String> leafItem2 = new TreeItem<>("Picture2");
        TreeItem<String> leafItem3 = new TreeItem<>("Video1");
        TreeItem<String> leafItem4 = new TreeItem<>("Video2");
        TreeItem<String> leafItem5 = new TreeItem<>("Music1");
        TreeItem<String> leafItem6 = new TreeItem<>("Music2");


        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);
        branchItem1.getChildren().addAll(leafItem1, leafItem2);
        branchItem2.getChildren().addAll(leafItem3, leafItem4);
        branchItem3.getChildren().addAll(leafItem5, leafItem6);
        myTreeView.setRoot(rootItem);

    }




}
