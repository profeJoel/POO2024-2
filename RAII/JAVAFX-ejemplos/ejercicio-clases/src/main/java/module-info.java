module com.clases {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.clases to javafx.fxml;
    exports com.clases;
}
