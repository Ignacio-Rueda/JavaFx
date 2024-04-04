
package ejemplofx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ignacio
 */
public class J_VBoxEjemplo extends Application {
    private VBox vbox;
    @Override
    public void start(Stage stage){
        //Separación entre nodos.
        vbox = new VBox(15);
        //Relleno para separar de los bordes.
        vbox.setPadding(new Insets(12));
        vbox.getChildren().addAll(new Button("Botón 1"),new Button("Botón 2"),new Button("Botón 3"));
        
        
        Scene scene = new Scene(vbox,500,500);
        stage.setTitle("VBOX");
        stage.setScene(scene);
        stage.show();
        
        
        
        

        
        
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
