package PasoInformacionEntreVentanas;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Ignacio
 */
public class A_PasoInformacionEntreVentanas extends Application {

    protected TextField campoTexto;
    protected Label etiqueta;

    @Override
    public void start(Stage stage) {

        stage.setTitle("VENTANA PRINCIPAL");
        //Crear panel
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);

        //Crear escena
        Scene scene = new Scene(root, 700, 200);

        //Crear una etiqueta
        etiqueta = new Label();
        etiqueta.setText("Pulse botón para seleccionar valor a pegar en el campo");

        //Crear un campo de texto
        campoTexto = new TextField();

        //Crear un botón
        Button boton = new Button("Pulsa para escoger un valor");
        //Cuando se pulse el botçon se abrirá una ventana secundaria.
        /**
         * Se le pasa como parámetro el objeto correspondiente a la ventana
         * principal, que aprovechará para acceder al campo texto de dicha
         * ventana principal
         */
        boton.setOnAction(eve -> new VentanaSecundaria(this));

        //Añadir el campo de texto al panel
        root.getChildren().addAll(etiqueta, campoTexto, boton);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }

}

/**
 * Esta clase corresponde a la ventana secundara que se abrirá cuando se pulse
 * el botón desde la ventana principal
 */
class VentanaSecundaria {

    /**
     * CONSTRUCTOR de la ventana secundaria. Recibe como parámetro el objeto
     * correspondiente a la ventana principal, que aprovechará para acceder al
     * campo texto de dicha ventana principal.
     *
     * @param ventanaPrincipal
     */
    VentanaSecundaria(A_PasoInformacionEntreVentanas ventanaPrincipal) {

        Stage secunStage = new Stage();
        secunStage.setTitle("Ventana secundaria");

        //Hacer la ventana modal para evitar que se pueda volver a la principal, sin cerrar esta.
        secunStage.initModality(Modality.APPLICATION_MODAL);

        //Crear un panel para depositar los controles botón sobre él
        FlowPane panel = new FlowPane();
        panel.setAlignment(Pos.CENTER);

        //Crear la escena pasándole el panel
        Scene scene = new Scene(panel, 290, 95);

        /**
         * Crear un botón que al pinchar establezca el valor "A" en el campo de
         * texto de la ventana principal, y luego cierre esta ventana secundaria
         */
        Button boton = new Button("A");
        boton.setOnAction(eve -> {
            ventanaPrincipal.campoTexto.setText("A");
            secunStage.close();
        });

        Button boton2 = new Button("10");
        boton2.setOnAction(eve -> {
            ventanaPrincipal.campoTexto.setText("10");
            secunStage.close();
        });

        Button boton3 = new Button("##");
        boton3.setOnAction(eve -> {
            ventanaPrincipal.campoTexto.setText("##");
            secunStage.close();
        });

        panel.getChildren().addAll(boton, boton2, boton3);

        secunStage.setScene(scene);

        secunStage.show();

    }

}
