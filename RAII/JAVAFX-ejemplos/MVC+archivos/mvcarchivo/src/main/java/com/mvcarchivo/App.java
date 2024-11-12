package com.mvcarchivo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

import java.io.IOException;
import java.util.ArrayList;

import com.mvcarchivo.Controllers.PersonaController;
import com.mvcarchivo.Models.PersonaModel;

/**
 * JavaFX App
 */

public class App extends Application {
    private PersonaController controller = new PersonaController();
    private ObservableList<PersonaModel> listaPersonas;

    @Override
    public void start(Stage primaryStage) {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15));

        // Campos de texto
        TextField nombreField = new TextField();
        nombreField.setPromptText("Nombre");
        TextField apellidoField = new TextField();
        apellidoField.setPromptText("Apellido");
        
        // Botones
        Button agregarButton = new Button("Agregar");
        Button eliminarButton = new Button("Eliminar Seleccionado");

        // Tabla
        TableView<PersonaModel> tableView = new TableView<>();
        TableColumn<PersonaModel, String> nombreColumn = new TableColumn<>("Nombre");
        nombreColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getNombre()));
        TableColumn<PersonaModel, String> apellidoColumn = new TableColumn<>("Apellido");
        apellidoColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getApellido()));
        
        tableView.getColumns().addAll(nombreColumn, apellidoColumn);

        try {
            listaPersonas = FXCollections.observableArrayList(controller.leerPersonas());
            tableView.setItems(listaPersonas);
        } catch (IOException e) {
            e.printStackTrace();
        }

        agregarButton.setOnAction(e -> {
            String nombre = nombreField.getText();
            String apellido = apellidoField.getText();
            if (!nombre.isEmpty() && !apellido.isEmpty()) {
                PersonaModel nuevaPersona = new PersonaModel(nombre, apellido);
                listaPersonas.add(nuevaPersona);
                try {
                    controller.agregarPersona(nuevaPersona);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                nombreField.clear();
                apellidoField.clear();
            }
        });

        eliminarButton.setOnAction(e -> {
            PersonaModel seleccionada = tableView.getSelectionModel().getSelectedItem();
            if (seleccionada != null) {
                listaPersonas.remove(seleccionada);
                try {
                    controller.actualizarArchivo(new ArrayList<>(listaPersonas));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        layout.getChildren().addAll(nombreField, apellidoField, agregarButton, eliminarButton, tableView);

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setTitle("CRUD de Persona");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
