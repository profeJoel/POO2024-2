package com.ejercicio1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        // Opcion 1
        // stage.setTitle("Ejercicio 1");
        // VBox caja = new VBox();

        // Label texto = new Label("Presione el boton para número aleatorio");
        // Button boton = new Button("Generar Aleatorio");
        // boton.setOnAction(e -> {
        //     int aleatorio = (int) (Math.random()*10+1);
        //     texto.setText("Valor aleatorio: " + aleatorio);
        // });

        // caja.getChildren().addAll(texto, boton);

        // scene = new Scene(caja, 400, 300);
        // stage.setScene(scene);
        // stage.show();

        //Opcion 2
        stage.setTitle("Ejercicio 1");
        VBox caja = new VBox();
        GridPane bloque = new GridPane();

        Label minimo = new Label("Minimo");
        Label maximo = new Label("Maximo");

        TextField valorMinimo = new TextField();
        TextField valorMaximo = new TextField();

        bloque.add(minimo, 0,0);
        bloque.add(maximo, 0,1);
        bloque.add(valorMinimo, 1,0);
        bloque.add(valorMaximo, 1,1);

        Label texto = new Label("Presione el boton para número aleatorio");
        Button boton = new Button("Generar Aleatorio");
        boton.setOnAction(e -> {
            if(!valorMinimo.getText().equals("") && !valorMaximo.getText().equals("")){
                try {
                    int numMinimo = Integer.parseInt(valorMinimo.getText());
                    int numMaximo = Integer.parseInt(valorMaximo.getText());
                    if(numMinimo < numMaximo){
                        int aleatorio = (int) (Math.random()*(numMinimo-numMaximo+1)+numMaximo);
                        texto.setText("Valor aleatorio: " + aleatorio);
                    }
                    else
                        texto.setText("Error: valor minimo debe ser menor a valor maximo");
                } catch (Exception err) {
                    texto.setText("Error: valores no numericos: " + err);
                }
                
            }
            else{
                texto.setText("Error: valores invalidos para el calculo");
            }
        });

        caja.getChildren().addAll(bloque, boton, texto);

        scene = new Scene(caja, 400, 300);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}