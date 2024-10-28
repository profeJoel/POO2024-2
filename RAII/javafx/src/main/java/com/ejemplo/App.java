package com.ejemplo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public int contador = 0;

    @Override
    public void start(Stage ventana) throws IOException {
        ventana.setTitle("Es el primer programa GUI");
        // crear panel de contenido
        VBox caja = new VBox();

        //Crear nuestros componentes graficos
        //Label texto = new Label("GUI es Graphic User Interface...");
        Label texto = new Label("Presione el boton para iniciar el contador");
        Button boton = new Button("OK");

        // boton.setOnAction(
        //     new EventHandler<ActionEvent>() {
        //         @Override
        //         public void handle(ActionEvent event){
        //             System.out.println("OK");
        //         }
        //     }
        // );

        // operaciones Lambda
        // {gatillante} -> {ejecucion}
        //boton.setOnAction(e -> System.out.println("OK"));
        boton.setOnAction(e -> {
            contador++;
            //System.out.println("Contador: " + contador);
            texto.setText("Contador: " + contador);
        });

        // Agregar los componentes a la caja
        caja.getChildren().addAll(texto, boton);

        scene = new Scene(caja, 640, 480);
        ventana.setScene(scene);
        ventana.show();
    }

    public static void main(String[] args) {
        launch();
    }

}