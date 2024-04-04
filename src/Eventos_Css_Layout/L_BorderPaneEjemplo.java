
package Eventos_Css_Layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *BorderPane: Dispone a sus nodos hijos, en cinco áreas separadas: SUPERIOR - INFERIOR - DERECHA - IZQUIERDA -CENETRO.
 * @author Ignacio
 */
public class L_BorderPaneEjemplo extends Application{
    private BorderPane borderPane = new BorderPane();
    @Override
    public void start(Stage stage){
        
        borderPane.setTop(new Button("SET TOP-1"));
        borderPane.setTop(new Button("SET TOP-2"));//Si le das la misma posición lo machaca.
        
        borderPane.setLeft(new Button("SET LEFT"));
        
        borderPane.setRight(new Button("SET-RIGHT"));
        
        borderPane.setCenter(new Button("SET CENTER"));
        
        borderPane.setBottom(new Button("SET BOTTOM"));
        
        
        
        Scene scene = new Scene(borderPane,300,300);
        
        stage.setTitle("Border Pane");
        stage.setScene(scene);
        stage.show();
        
    
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
