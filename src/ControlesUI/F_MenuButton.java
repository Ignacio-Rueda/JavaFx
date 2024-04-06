package ControlesUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * MenuButton tiene la apariencia de un botón y se comporta como un menú. Cuando
 * se activa, muestra una lista de opciones en forma de menú emergente.
 *
 * @author Ignacio
 */
public class F_MenuButton extends Application {

    Label msgLbl = new Label("Elige el helado");

    @Override
    public void start(Stage stage) {
        //Crear el MenuItem chocolate
        MenuItem choco = new MenuItem("Chocolate");
        //Añadir EventHandler al menu
        choco.setOnAction((ActionEvent e) -> {
            msgLbl.setText("Has elegido Chocolate");
        });
        
        MenuItem fresa = new MenuItem("Fresa");
        fresa.setOnAction((ActionEvent e) -> {
            msgLbl.setText("Has elegido Fresa");
        });
        
        MenuItem vainilla = new MenuItem("Vainilla");
        vainilla.setOnAction((ActionEvent e) -> {
            msgLbl.setText("Has elegido vainilla");
        });

        //Crear el MenuButton
        MenuButton helados = new MenuButton("Selecciona");
        //Añadir los elementos del menú al MenuButton
        helados.getItems().addAll(choco, fresa,vainilla);

        //Crear VBOX
        VBox vBox = new VBox();
        vBox.getChildren().addAll(helados, msgLbl);
        //Establecer el tamaño mínimo
        vBox.setMinSize(350, 250);
        //Aplicamos estilos a VBOX
        vBox.setStyle("-fx-padding:10;"+
                "-fx-border-style:solid inside;"+
                "-fx-border-width:3;"+
                "-fx-border-width:1;"+
                "-fx-border-insets:5;"+
                "-fx-border-radius:1;"+
                "-fx-border-color:red;"
                );
        
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("Ejemplo MenuButto");
        stage.show();
    }
    
    public static void main(String args[]) {
        launch(args);
    }
    
}
