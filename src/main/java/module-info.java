module org.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.workshopjavafxjdbc to javafx.fxml;
    exports org.example.workshopjavafxjdbc;
}