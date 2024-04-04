
package ejemplofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *Lo contenedores o paneles de diseño se usan para disponer los controles de la interfaz de usuario dentro de un escenario gráfico de una aplicación JavaFX. 
 * Los layouts absolutos se suelen usar sobre todo para posicionar imágenes o digramas. Se emplea la clase Pane. Se puede utilizar para posicionar nodos en coordenadas absolutas.
 */
public class I_AbsoluteLayoutEjemplo extends Application {
    @Override
    public void start(Stage stage){
        Pane root = new Pane();
        //Crear rectángulo
        Rectangle rect = new Rectangle(25, 25, 50, 50);
        rect.setFill(Color.RED);
        
        //Crear una línea
        Line line = new Line(90,40,230,40);
        line.setStroke(Color.BLUE);
        //Crear un círculo
        Circle circle = new Circle(130, 130, 30,Color.PURPLE);
        
        
        //Añadir figuras
        root.getChildren().addAll(rect,line,circle);
        
        
        
        Scene scene = new Scene(root,500,500,Color.ALICEBLUE);
        stage.setTitle("Absolute Layout");
        stage.setScene(scene);
        stage.show();
        
    }
    public static void main(String args []){
        launch(args);
    }
}
