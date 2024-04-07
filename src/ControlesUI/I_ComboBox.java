package ControlesUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * ComboBox: Permite elegir una opción de una lista predefinida de opciones.
 *
 * @author Ignacio
 */
public class I_ComboBox extends Application {

    @Override
    public void start(Stage stage) {
        ComboBox comboBox = new ComboBox();
        //Para hacerlo editable.
        comboBox.setEditable(true);
        Label valorSeleccionado = new Label("Lenguaje seleccionado: ");
        //Añadimos elementos
        comboBox.getItems().add("Java");
        comboBox.getItems().add("C#");
        comboBox.getItems().add("Ada");
        comboBox.getItems().add("Lisp");
        comboBox.getItems().add("Visual Basic");

        comboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //Recoger el valor de la opción seleccionada. Si no se se selecciona nada, el método devuelve null
                String valor = (String) comboBox.getValue();

                if (valor != null) {
                    valorSeleccionado.setText("Lenguaje seleccionado " + valor);
                } else {
                    valorSeleccionado.setText("Lenguaje seleccionado: ");
                }

            }
        });
        
        

        //Declarar el layout y añadirle el comboBox
        VBox vBox = new VBox(comboBox,valorSeleccionado);

        Scene scene = new Scene(vBox, 300, 120);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }

}
