package org.example.workshopjavafxjdbc;

import javafx.scene.control.Alert;

public class Alerts {
    public static void showAlerts(String title, String header, String content, Alert.AlertType type){
        Alert alert = new Alert(type);//criando alert
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();//mostrar o alert
    }
}
