
package ControlesUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**CheckButton puede tener tres estados diferentes:
 * - Seleccionado.
 * - No seleccionado.
 * - Indeterminado.
 *
 * @author Ignacio
 */
public class G_CheckButton extends Application{
    @Override
    public void start(Stage stage){
    //Crea una etiqueta
    Label etiqueta = new Label();
    etiqueta.setText("El checkBox NO está seleccionado");
    
    CheckBox checkBox = new CheckBox("Estudiante");

    checkBox.setOnAction((ActionEvent)->{
        if(checkBox.isSelected()){
            etiqueta.setText("El checkBox SI está seleccionado");
        }else{
            etiqueta.setText("El checkBox NO está seleccionado");
        }
        
    });
    
    VBox vBox = new VBox();
    vBox.getChildren().addAll(etiqueta,checkBox);
    
    Scene scene = new Scene(vBox,250,130);
    
    stage.setTitle("Ejemplo checkBox");
    stage.setScene(scene);
    stage.show();
        
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
