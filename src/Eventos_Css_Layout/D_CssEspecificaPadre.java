
package Eventos_Css_Layout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ignacio
 */
public class D_CssEspecificaPadre extends Application{
    
    @Override
    public void start(Stage stage){
        //Nodo raiz de la clase StackPane
        StackPane root = new StackPane();
        
        //Crear un Nodo de la clase Button
        Button boton = new Button();
        boton.setText("Botón que no pertenece al panel VBox");
        
        boton.setOnAction((ActionEvent event)->{
            System.out.println("Pulsado el botón");
        });
        
        //Creamos dos botones
        Button botonA = new Button("Botón A");
        Button botonB = new Button("Botón B");
        
        
        botonA.setOnAction((ActionEvent event)->{
            System.out.println("Pulsado el botón A");
        });
        botonB.setOnAction((ActionEvent event)->{
            System.out.println("Pulsado el botón B");
        });
        
        //Añadimos los botones al Vbox-> Es un componente de diseño layout (Esquema de distribución de los elementos dentro de un diseño) que coloca todos sus nodos hijos en una fila vertical
        VBox vbox = new VBox(botonA,botonB);
        vbox.getStylesheets().add("recursos/padreCss.css");
        
        //Añadimos el vbox como hijo de raiz
        root.getChildren().add(vbox);
        
        //Añadimos el botón como hijo de raíz. Nótese que éste no es hijo del VBox
        root.getChildren().add(boton);
    
        
        //Crear la escena
        Scene scene = new Scene(root,600,600);
        
        //Título ventana
        stage.setTitle("CSS ESPECIFICA PADRE");
        stage.setScene(scene);
        stage.show();
        
        
        
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
