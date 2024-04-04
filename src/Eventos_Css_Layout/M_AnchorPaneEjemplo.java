
package Eventos_Css_Layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *AnchorPane se traduce como panel ancla.
 * Este panel ancla los bordes de los nodos secundarios (los componentes que pongamos sobre este panel) a un desplazamiento especificado desde los bordes del panel de anclaje.
 * Si el panel de anclaje tiene establecido un borde o un relleno (padding), los desplazamientos se medirán desde el borde interior de dichos encartes.
 * 
 * AnchorPane es un panel de diseño bastante sencillo que se suele usar con otros paneles de diseño para crear diseños mas elaborados.
 * @author Ignacio
 */
public class M_AnchorPaneEjemplo extends Application {
  
    @Override
    public void start(Stage stage){
        AnchorPane  anchorPane = new AnchorPane();
        
        Button btn = new Button("Abrir");
        
        AnchorPane.setTopAnchor(btn,10.0);
        AnchorPane.setLeftAnchor(btn, 10.0);
        AnchorPane.setRightAnchor(btn,65.0);
        
        //Botón en el bode derecho
        Button button = new Button("Añadir");
        AnchorPane.setTopAnchor(button, 10.0);
        AnchorPane.setRightAnchor(button, 10.0);
        
        anchorPane.getChildren().addAll(btn,button);
        
        //Añadir el panel a la escena
        Scene scene = new Scene(anchorPane,220,190);
        
        //Titulo escenario
        stage.setTitle("Ancla");
        
        stage.setScene(scene);
        stage.show();
        
        
        
    }
    
    
    public static void main(String args[]){
        launch(args);
    }
    
}
