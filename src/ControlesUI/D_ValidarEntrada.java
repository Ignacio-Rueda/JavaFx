
package ControlesUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ignacio
 */
public class D_ValidarEntrada extends Application{
    @Override
    public void start(Stage stage){
        
        Button boton = new Button("Validar");
        Label texto = new Label("Introduce un número entero");
        TextField textoIntroducido = new TextField();
        Label respuesta = new Label();
        
        
        boton.setOnAction((ActionEvent e)->{
            try{
                Integer i = Integer.parseInt(textoIntroducido.getText());
                respuesta.setText("Texto válido "+i);
                
            }catch(NumberFormatException ex){
                respuesta.setText("¡No es un entero!");
            }
        });
        
        VBox vBox = new VBox();
        vBox.getChildren().addAll(texto,textoIntroducido,boton,respuesta);
        
        Scene scene = new Scene(vBox,500,500);
        
        stage.setTitle("Validar entrada");
        stage.setScene(scene);
        stage.show();
        
        
                
    }
    
    
    public static void main(String args[]){
        launch(args);
    }
    
    
}
