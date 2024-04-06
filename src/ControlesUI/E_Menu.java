
package ControlesUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *Para tener la clásica barra de menú que suele tener toda aplicación de escritorio:
 * 1-Hay que crear una instancia de MenuBar.
 * 2-Añdir el menu al grafo de escena.
 * 3-Cuando se haya creado el MenuBar, podremos añadirle instancias de Menu.
 * @author Ignacio
 */
public class E_Menu extends Application{
    @Override
    public void start(Stage stage){
    //Crear BARRA de menú
    MenuBar menuBar = new MenuBar();
    //Añadir la barra a un panel de contenedor.
    VBox vBox = new VBox(menuBar);
    
    //Crear el menú
    Menu menuArchivo = new Menu("Archivo");
    //Añadir dos elementos al menú
    MenuItem menuItem1 = new MenuItem("Abrir");
    MenuItem menuItem2 = new MenuItem("Cerrar");
    
    //Añadimos los elementos de menú al menú
    menuArchivo.getItems().addAll(menuItem1,menuItem2);
    
    //Especificamos las acciones a tomar si se pincha en las opciones del menú
    
    menuItem1.setOnAction(e->{
        System.out.println("Se seleccionó la opción abrir");
    });
    menuItem2.setOnAction(e->{
        System.out.println("Se seleccionó la opción cerrar");
        stage.close();
    });
    //Añadir el menú a la barra de menú
    menuBar.getMenus().add(menuArchivo);
    
    Scene scene = new Scene(vBox,700,500);
    stage.setTitle("Menú");
    stage.setScene(scene);
    stage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
