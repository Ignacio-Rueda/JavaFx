/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos_Css_Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *StackPane es un layout que añade sus nodos a modo de pila: el primer elemento queda debajo del segundo y así sucesivamente.
 * De manera predeterminada StackPane coloca los nodos en el centro, pero ese se puede modificar.
 * @author Ignacio
 */
public class N_StackPaneEjemplo extends Application{
    @Override
    public void start(Stage stage){
        StackPane stackPane = new StackPane();
        
        //Establecer relleno
        stackPane.setPadding(new Insets(25));
        
        //Asignamos la alineación al objeto
        stackPane.setAlignment(Pos.BOTTOM_RIGHT);
        stackPane.getChildren().addAll(new Circle(295,150,50,Color.BURLYWOOD),new Button("Botón"));
        
        //Crear panel
        Scene scene = new Scene(stackPane,250,160);
        
        stage.setTitle("StackPane ejemplo");
        stage.setScene(scene);
        stage.show();
        
    
        
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
