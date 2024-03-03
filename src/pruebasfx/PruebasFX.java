package pruebasfx;

import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ignacio
 */
public class PruebasFX extends Application{


    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hola JavaFX");
        Scene scene = new Scene(new StackPane(label),640,480);
        stage.setScene(scene);
        stage.show();   
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
