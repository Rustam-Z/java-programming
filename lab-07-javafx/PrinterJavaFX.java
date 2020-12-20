/*
By Rustam Zokirov,
U1910049
Lab: #7
Printer Application 
*/

// import some libraries
import javafx.application.Application;  
import javafx.stage.Stage;   
import javafx.scene.Scene;    
import javafx.scene.Group;  
import javafx.scene.layout.StackPane;  
import javafx.scene.text.Text;  
import javafx.scene.transform.Scale;  
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
  
public class PrinterJavaFX extends Application {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        
        Label labelPrinter = new Label("Printer: My Printer");
		labelPrinter.setLayoutX(30);  
		labelPrinter.setLayoutY(10);
        labelPrinter.setPrefSize(150, 20);
        		
        Label txtQuality = new Label("Print Quality: ");
		txtQuality.setLayoutX(30);  
		txtQuality.setLayoutY(100); 
		txtQuality.setPrefSize(150, 20);
		
        TextArea labelType = new TextArea();
		labelType.setLayoutX(25);  
		labelType.setLayoutY(35); 
        labelType.setPrefSize(50, 60);
        
		TextArea txtSize = new TextArea();
		txtSize.setLayoutX(150);  
		txtSize.setLayoutY(35); 
        txtSize.setPrefSize(40, 60);
        
		TextArea txtSpace = new TextArea();
		txtSpace.setLayoutX(270);  
		txtSpace.setLayoutY(35); 
		txtSpace.setPrefSize(50, 60);
		
        CheckBox checkImage = new CheckBox("Image");
        checkImage.setLayoutX(75);  
		checkImage.setLayoutY(37); 
        checkImage.setPrefSize(70, 20);
        
        CheckBox checkText = new CheckBox("Text");
		checkText.setLayoutX(75);  
		checkText.setLayoutY(57); 
        checkText.setPrefSize(70, 20);
        
        CheckBox checkCode = new CheckBox("Code");
		checkCode.setLayoutX(75);  
		checkCode.setLayoutY(77); 
        checkCode.setPrefSize(70, 20);	
        
        CheckBox checkPrint = new CheckBox("Print to File");
		checkPrint.setLayoutX(220);  
		checkPrint.setLayoutY(100); 
		checkPrint.setPrefSize(100, 20);
		
        RadioButton radioSelect = new RadioButton("Select");
		radioSelect.setLayoutX(190);  
		radioSelect.setLayoutY(37); 
        radioSelect.setPrefSize(70, 20);
        
        RadioButton radioAll = new RadioButton("All");
		radioAll.setLayoutX(190);  
		radioAll.setLayoutY(57); 
        radioAll.setPrefSize(70, 20);
        
        RadioButton radioApplet = new RadioButton("Applet");
        radioApplet.setLayoutX(190);  
		radioApplet.setLayoutY(77); 
		radioApplet.setPrefSize(70, 20);
		
        ComboBox comboQuality = new ComboBox();
        comboQuality.getItems().add("High");
		comboQuality.getItems().add("Middle");
		comboQuality.getItems().add("Low");
        comboQuality.setLayoutX(115);  
		comboQuality.setLayoutY(100); 
		comboQuality.setPrefSize(75, 20);
		
        Button buttonOk = new Button("OK");
		buttonOk.setLayoutX(330);  
		buttonOk.setLayoutY(20); 
        buttonOk.setPrefSize(80, 30);
        
        Button buttonCancel = new Button("Cancel");
		buttonCancel.setLayoutX(330);  
		buttonCancel.setLayoutY(50); 
        buttonCancel.setPrefSize(80, 30);
        
        Button buttonSetup = new Button("Setup...");
		buttonSetup.setLayoutX(330);  
		buttonSetup.setLayoutY(80); 
        buttonSetup.setPrefSize(80, 30);
        
        Button buttonHelp = new Button("Help");
        buttonHelp.setLayoutX(330);  
		buttonHelp.setLayoutY(110); 
		buttonHelp.setPrefSize(80, 30);
		
		Group root = new Group();

        root.getChildren().add(labelPrinter);
		root.getChildren().add(txtQuality);	
		root.getChildren().add(labelType);
		root.getChildren().add(txtSize);
		root.getChildren().add(txtSpace);
		root.getChildren().add(checkImage);
		root.getChildren().add(checkCode);
		root.getChildren().add(checkPrint);
		root.getChildren().add(checkText);
		root.getChildren().add(radioAll);
		root.getChildren().add(radioApplet);
		root.getChildren().add(radioSelect);
		root.getChildren().add(comboQuality);
		root.getChildren().add(buttonCancel);
		root.getChildren().add(buttonHelp);
		root.getChildren().add(buttonOk);
		root.getChildren().add(buttonSetup);
        
        // New scene
        Scene scene = new Scene(root, 450, 200); 	
        	
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Printer");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args); // running app
    }  
}  