package ejemplofx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * FlowPane es un layourt horizontal/vertical. Dispone sus nodos hijos en una
 * fila hasta que la anchura del panel alcnaza cierto tamaño que puedes
 * especificar. En el momento que se alcanza ese tamaño se empieza por una nueva
 * fila de nodos hijos.
 *
 * @author Ignacio
 */
public class O_FlowPaneEjemplo extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL);

        //Espacio entre filas y columnas.
        flowPane.setVgap(8);
        flowPane.setHgap(4);

        //Ancho preferido
        flowPane.setPrefWrapLength(300);

        //Añadimos 10 botones
        for (int i = 0; i < 20; i++) {
            flowPane.getChildren().add(new Button("Botón"));
        }
        
        
        Scene scene = new Scene(flowPane);
        
        //Establecemos propiedades del escenario
        stage.setTitle("Ejemplo Flowpane");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }

}
