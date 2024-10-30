module com.ejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejercicio1 to javafx.fxml;
    exports com.ejercicio1;
}
