/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *https://javiergarciaescobedo.es/programacion-en-java/96-javafx/481-hojas-de-estilo-css-con-javafx
 * @author Ignacio
 */
public class E_CssEspecificoComponente extends Application{
    
    @Override
    public void start(Stage stage){
        
        Button primerBoton = new Button("Primer botón");
        Button segundoBoton = new Button("Segundo botón");
        Button tercerBoton = new Button("Tercer botón");
        
        primerBoton.setStyle("-fx-background-color: red");
        segundoBoton.setStyle("-fx-background-color:blue");
        tercerBoton.setStyle("-fx-background-color:yellow");
        
        VBox vbox = new VBox(primerBoton,segundoBoton,tercerBoton);
        
        StackPane root = new StackPane();
        root.getChildren().add(vbox);
        
        Scene scene = new Scene(root,600,600);
        
        stage.setTitle("Estilos especificos");
        stage.setScene(scene);
        stage.show();
       
        
    }
    public static void main(String args[]){
        launch(args);
    }
}
