package Eventos_Css_Layout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *TRES PASOS PARA MANEJAR EVENTOS EN JAVAFX:
 * 1.- Crear una fuente de evento (event source)
 * Una fuente de evento es un control, como por ejemplo un botón, que puede generar eventos.
 * 2.- Crear un manejador de eventos (event handler)
 * Para crear un manejador de eventos, debemos crear un objeto que implemente la interfaz EventHandler y proporcionar una implementación para el método handle.
 * 3.- Registrar el manejador de evento en la fuente del evento.
 * De este modo, el método handle será invocado cuando ocurra el evento.
 * @author Ignacio
 */
public class G_Eventos extends Application {

    @Override
    public void start(Stage stage) {

        Button boton = new Button();
        boton.setText("Pulsar");
        /**
         * Crear manejador de evento para la acción que se debe hacer al clicar
         * sobre el botón.
         * ActionEvent es un tipo de evento procesado por EventHandler. Un objeto EventHandler proporciona el método manejador para procesar una acción disparada ppara un botón.
         */
        boton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("hola");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(boton);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Eventos");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
