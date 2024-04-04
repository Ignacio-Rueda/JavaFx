
package Eventos_Css_Layout;


import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Ignacio
 */
public class C_Animacion extends Application {
    
    @Override
    public void start(Stage stage){
    
        
        String mensaje ="Texto que aparecerá en la aplicación";
        Text texto = new Text(mensaje);
        texto.setLayoutY(25);
        texto.setTextOrigin(VPos.TOP);
        texto.setTextAlignment(TextAlignment.JUSTIFY);
        texto.setWrappingWidth(400);
        texto.setFill(Color.rgb(187, 195, 107));
        texto.setFont(Font.font("SansSerif",FontWeight.BOLD,24));
        
        TranslateTransition transTransition = new TranslateTransition(new Duration(13000),texto);
        transTransition.setToY(-180);
        transTransition.setInterpolator(Interpolator.LINEAR);
        transTransition.setCycleCount(Timeline.INDEFINITE);
        
        
        Image image = new Image("http://www.matiacosta.com/wp-content/uploads/2016/06/ataques-redes-sociales-trolls-david-el-gnomo-trolls-twitter.png");//Cuidado que no vale una ruta en el escritorio o a una carpeta, es una url
        ImageView imageView = new ImageView(image);

        Group textoGupo = new Group(texto);
        texto.setLayoutX(50);
        texto.setLayoutY(115);
        texto.setClip(new Rectangle(480, 60));
        
        Group root = new Group(imageView,textoGupo);
        
        Scene scene = new Scene(root,516,300);
        stage.setScene(scene);
        stage.setTitle("Hola aplicación");
        stage.show();
        
        transTransition.play();
        
        
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
    
}
