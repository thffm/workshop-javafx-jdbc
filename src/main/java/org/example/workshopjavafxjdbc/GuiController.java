package org.example.workshopjavafxjdbc;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

public class GuiController implements Initializable {
    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem manuItemAbout;

    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("onMenuItemSllerAction");
    }
    public void onMenuItemDepartementAction() throws  IOException{
        loadView("DepartmentList.fxml");
    }
    public void onMenuItemAboutAction(){
        loadView("About.fxml");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private synchronized void loadView(String absoluteName) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVbox = fxmlLoader.load();

            Scene mainScene =  HelloApplication.getMainScene();
            VBox mainVbox  =  (VBox)((ScrollPane) mainScene.getRoot()).getContent();//castint  casting


            Node mainMenu = mainVbox.getChildren().get(0);
            mainVbox.getChildren().clear();
            mainVbox.getChildren().add(mainMenu);
            mainVbox.getChildren().addAll(newVbox.getChildren())
;
        }catch (IOException   e){
            Alerts.showAlerts("IO Exception","Error loading view",e.getMessage(), Alert.AlertType.ERROR);
        }



    }
}
