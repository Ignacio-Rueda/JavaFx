package ControlesUI;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Permite seleccionar al usuario uno o más elementos (si se habilita para ello)
 * de una lista. Puedes establecer un alto y un ancho para un ListView (con el
 * método setPrefSize) pero no puedes establecer explícitamente cuántos
 * elementos deben estar visibles. La altura se determina en función de la
 * altura de cada elemento que se muestra. Si hay más elementos en el ListView
 * de los que caben en su área visible, el ListView agregará barras de
 * desplazamiento para que el usuario pueda desplazarse hacia arriba y hacia
 * abajo sobre los elementos.
 * 
 * 
 * Para recoger el valor de un elemento seleccionado en un ListView usaremos su propiedad SelectionModel.
 *
 * @author Ignacio
 */
public class J_ListView extends Application{
    @Override
    public void start(Stage stage){
        ListView listView = new ListView();
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);//Permite seleccionar varios elementos de una lista y no solo uno. El usuario podrá seleccionar varios elementos de la lista pulsando las teclas SHIFT para seleccionar un intervalo o CTRL para seleccionar elementos no contiguos en la listta.
        //Añadir elementos
        listView.getItems().add("Bizcochos");
        listView.getItems().add("Tostada");
        listView.getItems().add("Helado");
        
        //Añadimos un botón para obtener el valor seleccionado
        Button boton = new Button("Obtener el valor seleccionado");
        
        //Añadimos un botón para eleminar el valor seleccionado.
        Button eliminar = new Button("Eliminar el valor seleccionado");
        
        boton.setOnAction((ActionEvent e)->{
            System.out.println(listView.getSelectionModel().getSelectedItem());
        });
        
        eliminar.setOnAction((ActionEvent e)->{
            int indice = listView.getSelectionModel().getSelectedIndex();
            listView.getItems().remove(indice);
        });
        
        VBox vbox = new VBox(listView,boton,eliminar);
        
        //Añadir layout a la escena
        Scene scene = new Scene(vbox,300,120);
        
        stage.setTitle("List View");
        stage.setScene(scene);
        stage.show();
    
    }
    
    public static void main(String args[]){
        launch(args);
    }

}
