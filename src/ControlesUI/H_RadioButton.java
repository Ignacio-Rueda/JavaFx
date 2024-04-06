
package ControlesUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *Un botón de opción o de radio es un componente de interfaz gráfica de usuario que suele emplearse para permitir al usuario,
 * elegir UNA de entre un CONJUNTO predefinido de opciones.
 * Los botones de opción se arreglan en grupos de dos o más.
 * @author Ignacio
 */
public class H_RadioButton extends Application{
    @Override
    public void start(Stage stage){
    
        RadioButton radioButton1 = new RadioButton("La 1");
        RadioButton radioButton2 = new RadioButton("La 2");
        RadioButton radioButton3 = new RadioButton("Antena 3");
        RadioButton radioButton4 = new RadioButton("Cuatro");
        
        //Crear un Layout HBox y añadirle los radiobotones.
        HBox hbox = new HBox(radioButton1,radioButton2,radioButton3,radioButton4);
        //Espacio entre los elementos del layout
        hbox.setSpacing(10);
        
        //Crear un ToggleGroup:De esta manera podemos hacer que solo un RadioButton pueda ser seleccionado a la vez
        ToggleGroup grupo = new ToggleGroup();
        //Añadir todos los radioBotones al ToggleGroup
        grupo.getToggles().addAll(radioButton1,radioButton2,radioButton3,radioButton4);
       
        //Seleccionamos el primer radiobutton
        radioButton1.setSelected(true);
        
         //Podemos averiguar qué radioBoton de un ToggleGroup está seleccionado utilizando el método getSelectedToggle()
        RadioButton selectedRadioButton = (RadioButton) grupo.getSelectedToggle();
        
        String p = selectedRadioButton.getText();
        System.out.println(p);
        
        
        
        
        Scene scene = new Scene(hbox,300,100);
        
        stage.setTitle("CANALE DE TELEVISIÓN");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
