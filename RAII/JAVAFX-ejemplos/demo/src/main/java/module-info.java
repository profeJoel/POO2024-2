module com.ejemploscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejemploscenebuilder to javafx.fxml;
    exports com.ejemploscenebuilder;
}
