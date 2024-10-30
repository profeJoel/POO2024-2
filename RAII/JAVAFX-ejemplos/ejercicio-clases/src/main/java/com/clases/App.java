package com.clases;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
                Usuario usuario1;
                //Opcion 2
                stage.setTitle("Ejercicio de Clases y GUIs");
                VBox caja = new VBox();
                GridPane bloque = new GridPane();
        
                Label nombre = new Label("Nombre");
                Label correo = new Label("Correo");
                Label fecha = new Label("Fecha de Nacimiento");
        
                TextField textoNombre = new TextField();
                TextField textoCorreo = new TextField();
                DatePicker fechaNacimiento  = new DatePicker();
        
                bloque.add(nombre, 0,0);
                bloque.add(textoNombre, 1,0);
                bloque.add(correo, 0,1);
                bloque.add(textoCorreo, 1,1);
                bloque.add(fecha, 0,2);
                bloque.add(fechaNacimiento, 1,2);
        
                Label texto = new Label("Presione el boton para agregar persona");
                Button boton = new Button("Agregar");
                boton.setOnAction(e -> extracted(textoNombre, textoCorreo, fechaNacimiento, texto));
        
                caja.getChildren().addAll(bloque, boton, texto);
        
                scene = new Scene(caja, 400, 300);
                stage.setScene(scene);
                stage.show();
    }

    private void extracted(TextField textoNombre, TextField textoCorreo, DatePicker fechaNacimiento, Label texto) {
        Usuario usuario1;
        if(!textoNombre.getText().equals("") && !textoCorreo.getText().equals("")){
            String valorNombre = textoNombre.getText();
            String valorCorreo = textoCorreo.getText();
            String valorFecha = fechaNacimiento.getValue().toString();
            //texto.setText("Usuario: " + valorNombre + " " + valorCorreo + " " +valorFecha);
            usuario1 = new Usuario(valorNombre, valorCorreo, valorFecha);
            texto.setText(usuario1.toString());

        }
        else{
            texto.setText("Error: valores invalidos");
        }
    }

    public static void main(String[] args) {
        launch();
    }

}