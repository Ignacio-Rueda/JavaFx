/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos_Css_Layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ignacio
 */
public class A_EjemploFx extends Application {
    @Override
    public void start(Stage stage){
        /**
         * En una aplicación JavaFX los nodos de la escena son los elementos que componen  la escena.
         * La clase superior que representa estos nodods, es un panel. En este caso vamos a utilizar un StackPane.
         */
        Label label = new Label("Hola nachete 2");
        
        StackPane root = new StackPane();
        root.getChildren().add(label);
        
        Scene scene = new Scene(root,300,300);
        /**
         * Cada aplicación puede tener realmente varios escenarios (Stage).
         * Cada escenario varias escenas.
         */
        stage.setTitle("Titulo ventana");
        stage.setScene(scene);
        stage.show();
    
    
    }
    
    public static void main(String args[]){
        launch(args);
    }
}
