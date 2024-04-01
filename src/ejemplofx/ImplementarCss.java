/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ignacio
 */
public class ImplementarCss extends Application{
    @Override
    public void start(Stage stage){
        Button boton = new Button("Pulsar");
        
        boton.setOnAction((ActionEvent event)->{
            System.out.println("hola estilos css");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(boton);
        
        Scene scene = new Scene(root,500,500);
        scene.getStylesheets().add("recursos/styles.css");
        stage.setTitle("Estilos css");
        
        stage.setScene(scene);
        stage.show();
        
    
    }
    
    
    public static void main(String args[]){
        launch(args);
    }
    
    
}
