package ejemplofx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Este layout nos permite colocar nodos hijos en una fila horizontal.
 *
 * @author Ignacio
 */
public class K_HBoxEjemplo extends Application {
    //Declarar el layout
    private HBox caja;

    @Override
    public void start(Stage stage) {
        //Asignar 10 píxeles de separación entre los nodos
        caja = new HBox(10);
        /**
         * En un layout para añadir espacio alrededor del perímetro,se utiliza el métod setPadding.
         * Éste método recibe como parámetro un objeto de la clase Insets, que representa el tamaño del relleno. Hay dos constructores:
         * Insets(double valor) proporciona un relleno ara los cuatro bordes de un objeto.
         * Insets(double top,double right,double bottom,double left) permite establecer un valor de relleno diferente para cada borde.
         */
        caja.setPadding(new Insets(0,100,10,100));
        caja.setPadding(new Insets(15));//Agregar un relleno de 15 píxeles para separarlo del borde de la ventana
        //AddAll para agregar varios nodos en una sola línea
        caja.getChildren().addAll(new Button("Botón-A"),new Button("Botón-B"),new Button("Botón-C"));
        
        
        Scene scene = new Scene(caja);
        stage.setTitle("HBOX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

}
