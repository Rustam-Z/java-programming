/*import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
public class JavaFXLayoutDemo extends Application {
 
   @Override
   public void start(Stage stage) {
       Group root = new Group();
       Scene scene = new Scene(root, 500, 500, Color.BLACK);
 
       Rectangle r = new Rectangle(25,25,250,250);
       r.setFill(Color.BLUE);
       root.getChildren().add(r);
 
       stage.setTitle("JavaFX Scene Graph Demo");
       stage.setScene(scene);
       stage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
}*/


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class JavaFXLayoutDemo extends Application {
 
   @Override
   public void start(Stage stage) {
	
	Label lblName = new Label("What is your Name ?");
	TextField tfName = new TextField("Type your name ");
	Button btOk = new Button("Ok");

	HBox group = new HBox();

	group.getChildren().add(lblName);
	group.getChildren().add(tfName);
	group.getChildren().add(btOk);

	Scene scene = new Scene(group,500, 500);

       stage.setTitle("JavaFX Scene Graph Demo");
       stage.setScene(scene);
       stage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
}
