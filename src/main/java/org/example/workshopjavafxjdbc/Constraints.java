package org.example.workshopjavafxjdbc;

import javafx.scene.control.TextField;
//listener
public class Constraints {
    public static void setTextFieldInteger(TextField txt){
        txt.textProperty().addListener((obs,oldvalue,newValue)->{
            if (newValue != null && !newValue.matches("\\d*")){//d digito * qualquer quantidade
                txt.setText(oldvalue);
            }
        });
    }

    public static  void setTextFiledMaxLength(TextField txt, int max){
        txt.textProperty().addListener((obs,oldvalue,newValue) ->{
            txt.setText(oldvalue);
        });
    }

    public static void  setTextFieldDouble(TextField txt){
        txt.textProperty().addListener((obs,oldValue,newValue)->{
            if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")){
                txt.setText(oldValue);
            }
        });
    }

}