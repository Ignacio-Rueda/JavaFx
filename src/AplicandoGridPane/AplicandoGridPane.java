/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicandoGridPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Ignacio
 */
public class AplicandoGridPane extends Application {
    
    @Override
    public void start(Stage stage) {
        
        final Rectangle rec1 = new Rectangle(40, 40, Color.BLUE);
        Rectangle rec2 = new Rectangle(30, 10, Color.RED);
        Rectangle rec3 = new Rectangle(20, 30, Color.CHOCOLATE);
        Rectangle rec4 = new Rectangle(15, 15, Color.PINK);
        Rectangle rec5 = new Rectangle(15, 15, Color.VIOLET);
        Button boton = new Button("Di Hola");
        
        GridPane panel = new GridPane();//El constructor no acepta ningún parámetro
        
        panel.setVgap(10);//Separación vertical
        panel.setHgap(20);//Separación horizontal
        
        panel.add(rec1, 0, 0);
        panel.add(rec2, 1, 0);
        panel.add(rec3, 0, 1);
        panel.add(rec4, 1, 1);
        panel.add(rec5, 2, 0);
        panel.add(boton, 3, 0);
        
        GridPane.setRowIndex(rec5, 1);//Indicamos el rectángulo y la fila donde lo vamos a ubicar
        GridPane.setHalignment(rec4, HPos.CENTER);//Centramos el rectángulo 4 dentro de su ubicación
        GridPane.setMargin(rec1, new Insets(5));//Aplicamos márgenes
        //Mostramos líneas
        panel.setGridLinesVisible(true);
        
        boton.setOnAction((ActionEvent e) -> {
            System.out.println("Hola");
            //Para que tengamos acceso al rectángulo, debe ser declaro con final, para podeter tener acceso desde método handle
            rec1.setFill(Color.DARKSEAGREEN);
            
        });
        
        Scene scene = new Scene(panel);
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String args[]) {
        launch(args);
    }
}
