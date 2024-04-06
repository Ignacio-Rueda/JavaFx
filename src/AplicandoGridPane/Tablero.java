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
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Ignacio
 */
public class Tablero extends Application {

    @Override
    public void start(Stage stage) {
        HBox hBox = new HBox(15);//Damos separación
        hBox.setPadding(new Insets(10));//10 px separación margen
        GridPane board = new GridPane();
        GridPane controlBoard = new GridPane();

        controlBoard.setAlignment(Pos.CENTER);
        controlBoard.setHgap(5);
        controlBoard.setVgap(5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board.add(new Rectangle(50, 50, Color.BEIGE), i, j);
            }
        }
        final Circle circulo = new Circle(15, Color.ROYALBLUE);
        circulo.setEffect(new Lighting());
        board.add(circulo, 2, 2);
        GridPane.setHalignment(circulo, HPos.CENTER);
        board.setGridLinesVisible(true);

        Button upButton = new Button("↑");//alt 24
        Button downButton = new Button("↓");
        Button rightButton = new Button("→");
        Button leftButton = new Button("←");//alt 27

        controlBoard.add(upButton, 1, 0);
        controlBoard.add(downButton, 1, 2);
        controlBoard.add(rightButton, 2, 1);
        controlBoard.add(leftButton, 0, 1);
        //Eventos
        upButton.setOnAction((ActionEvent e) -> {
            GridPane.setRowIndex(circulo, GridPane.getRowIndex(circulo) - 1);
        });

        downButton.setOnAction((ActionEvent e) -> {
            GridPane.setRowIndex(circulo, GridPane.getRowIndex(circulo) + 1);
        });

        rightButton.setOnAction((ActionEvent e) -> {
            GridPane.setColumnIndex(circulo, GridPane.getColumnIndex(circulo) + 1);
        });

        leftButton.setOnAction((ActionEvent e) -> {
            GridPane.setColumnIndex(circulo, GridPane.getColumnIndex(circulo) - 1);
        });

        hBox.getChildren().addAll(controlBoard, board);

        Scene scene = new Scene(hBox);
        stage.setTitle("Juego");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }

}
