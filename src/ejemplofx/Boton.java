
package ejemplofx;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 *
 * @author Ignacio
 */
public class Boton extends Application {
    @Override
    public void start(Stage stage){
        Button boton = new Button();
        boton.setText("Pulsar");
        
        boton.setOnAction((ActionEvent event)->{
              System.out.println("hola desde el botón");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(boton);
        
        
        Scene scene = new Scene(root,600,600);
        
        stage.setTitle("Ventana botón");
        stage.setScene(scene);
        stage.show();
        
    
    }
    public static void main(String args[]){
        launch(args);
    }


}
    

