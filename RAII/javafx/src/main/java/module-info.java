module com.ejemplo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejemplo to javafx.fxml;
    exports com.ejemplo;
}
