package org.example.workshopjavafxjdbc.gui;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
    public void onMenuItemDepartementAction(){
        System.out.println("onMenuItemDepartmentAction");
    }
    public void onMenuItemAboutAction(){
        System.out.println("onMenuItemAboutAction");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
