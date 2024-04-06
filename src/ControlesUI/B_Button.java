package ControlesUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *Un botón puede estar en uno de los siguientes modos:
 * - Botón normal: su ActionEvent asociado se dispara cuando el botón se activa.
 * - Botón por defecto: su ActionEvent se dispara cuando se pulsa la tecla intro y ningún otro nodo de la escena consume la tecla presionada.
 * - Botón cancelar: su ActionEvent se dispara cuando se pulsa la tecla Esc y ningún otro nodo de la escena consume la tecla presionada.
 * 
 * Los modos por defecto y cancelar se representan por las propiedades defaultButton y cancelButton. Podemos establecer una de estas propiedades a true para obtener un botón de ese tipo.
 * Por defecto amabas propiedades está a false.
 * @author Ignacio
 */
public class B_Button extends Application {

    @Override
    public void start(Stage stage) {
        //Crear etiqueta 
        Label etiquetaNormal = new Label("Etiqueta para botón normal");

        Button btnNormal = new Button("Pulsar Normal");
        btnNormal.setOnAction((ActionEvent e) -> {
            etiquetaNormal.setText("Has pulsado el botón NORMAL");
        });
        
        //Crear etiqueta
        Label etiquetaCancel = new Label("Etiqueta para botón cancelar");
        
        Button btnCancel = new Button("Pulsar tecla Escape");
        //Establecemos que será de tipo cancel
        btnCancel.setCancelButton(true);
        btnCancel.setOnAction((ActionEvent e)->{
            etiquetaCancel.setText("Has pulsado la tecla Escape!");
        });
        
        
        //Crear etiqueta
        Label etiquetaPulsarIntro = new Label("Etiqueta pulsar Intro");
        
        Button btnPulsarIntro = new Button("Pulsar tecla Intro");
        //Establecemos que será del tipo default
        btnPulsarIntro.setDefaultButton(true);
        
        btnPulsarIntro.setOnAction((ActionEvent e)->{
            etiquetaPulsarIntro.setText("Has pulsado la tecla Intro!");
        });
        
    
        
        
        
        
        
        
        
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(etiquetaNormal,btnNormal,etiquetaCancel,btnCancel,etiquetaPulsarIntro,btnPulsarIntro);
        
        Scene scene = new Scene(vbox,500,500);
        
        stage.setTitle("Tipos de estado en un botón");
        stage.setScene(scene);
        stage.show();
        

    }

    public static void main(String args[]) {
        launch(args);
    }
}
