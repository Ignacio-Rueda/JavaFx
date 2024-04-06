package ControlesUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * - Label puede mostrar un texto, un icono, imagen o ambas cosas. Una etiqueta
 * no puede tener foco, es decir, no se puede acceder a ella mediante la tecla
 * Tab o click del ratón. - TextField es un control de entrada de texto. Si
 * necesitamos un control para introducir más de una línea, entonces hay que
 * recurrir a TextArea.
 *
 * @author Ignacio
 */
public class A_Etiquetas_Texto extends Application {

    //Crear etiqueta
    Label etiqueta = new Label("Escribe tu nombre en los campos de texto.");
    //Crea etiqueta para el nombre
    Label labelNombre = new Label("Nombre");

    @Override
    public void start(Stage stage) {
        //Dar color a la etiqueta
        etiqueta.setTextFill(Color.valueOf("0076a3"));
        /**
         * ATENCIÓN: Obtener la imagen y asociala a la etiqueta: Deberíamos
         * capturar las excepciones que puedan surgir en ese punto, por si no
         * existiera. No lo hacemos por claridad en el código
         */

        //Si quieres tener la imagen en una ubicación diferente debe ser algo asi: 
        String rutaAbsoluta = "C:/Users/Ignacio/Documents/NetBeansProjects/EjemploFx/src/recursos/lupa.png";
    
        try {
            Image image = new Image(new FileInputStream(rutaAbsoluta));
            etiqueta.setGraphic(new ImageView(image));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(A_Etiquetas_Texto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //Si no hubieses querido tener la imagen en un directorio diferente
        //------------------------------------------------------------------
        //Image image = new Image(getClass().getResourceAsStream("lupa.png"));
        

        //Crear campos de texto
        TextField campoNombre = new TextField();
        TextField campoApellidos = new TextField();
        //Ancho para mostrar 15 caracteres
        campoNombre.setPrefColumnCount(15);
        campoApellidos.setPrefColumnCount(15);

        //Establecer los manejadores ActionEvent para ambos campos de texto
        campoNombre.setOnAction((ActionEvent e) -> {
            etiqueta.setText("Has cambiado el nombre");
        });
        campoApellidos.setOnAction((ActionEvent e) -> {
            etiqueta.setText("Has cambiado los apellidos");
        });

        /**
         * Para la etiqueta del nombre establecemos manejadores para que se haga
         * un zoom, cuando con el ratón nos acerquemos a ella, y se quite el
         * zoom al alejarnos, al salir de ella.
         */
        labelNombre.setOnMouseEntered((MouseEvent e) -> {
            labelNombre.setScaleX(1.5);
            labelNombre.setScaleY(1.5);
        });

        labelNombre.setOnMouseExited((MouseEvent e) -> {
            labelNombre.setScaleX(1);
            labelNombre.setScaleY(1);
        });

        //Crear un GridPane
        GridPane gridPane = new GridPane();

        //Añadir etiquetas y campos al GridPane
        gridPane.addRow(0, etiqueta);
        gridPane.addRow(1, labelNombre, campoNombre);
        gridPane.addRow(2, new Label("Apellidos"), campoApellidos);

        //Establecer el tamaños del panel
        gridPane.setMinSize(350, 250);
        //Establecer propiedades del GridPnae
        gridPane.setStyle("-fx-padding:10");

        //Crear escena
        Scene scene = new Scene(gridPane);

        stage.setTitle("Etiquetas y campos de texto");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

}
