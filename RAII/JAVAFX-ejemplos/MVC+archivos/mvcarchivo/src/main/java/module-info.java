module com.mvcarchivo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mvcarchivo to javafx.fxml;
    exports com.mvcarchivo;
}
