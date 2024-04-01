
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
public class Lambda extends Application{
    @Override
    public void start(Stage stage){
        Button boton = new Button("Botón");
        
        boton.setOnAction((ActionEvent event)->{
            System.out.println("holi");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(boton);
        
        Scene scene = new Scene(root,300,300);
        
        stage.setTitle("LAMBDA");
        stage.setScene(scene);
        stage.show();
       
        
    }
    
    
    public static void main(String args[]){
        launch(args);
    }
}
