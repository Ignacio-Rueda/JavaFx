/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlesUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *Button hereda de Labeled, por ello, se pueden utilizar los siguientes métodos:
 * -setText(String text) Especifica el texto para el botón.
 * -setGraphic(Node graphic) Especifica el gráfico.
 * setGraphicTextGap: para establecer separación entre ellos.
 * @author Ignacio
 */
public class C_IconoButton extends Application {

    private int contador = 0;

    @Override
    public void start(Stage stage) {
        Button boton = new Button();
        Label etiqueta = new Label();

        etiqueta.setText("Prueba de botón");

        try {
            Image imageDecline = new Image(getClass().getResourceAsStream("ok.png"));
            boton.setGraphic(new ImageView(imageDecline));
        } catch (NullPointerException ex) {
            System.out.println("No existe la imagen.");
        }
        boton.setGraphicTextGap(25);
        
        boton.setText("Púlsame");
        boton.setOnAction((ActionEvent e) -> {
            contador++;
            etiqueta.setText(contador + "");
        });

        HBox root = new HBox();
        root.getChildren().addAll(boton, etiqueta);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Botón con imagen");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

}
