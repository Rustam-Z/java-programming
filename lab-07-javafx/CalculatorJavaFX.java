/*
By Rustam Zokirov,
U1910049
Lab: #7
Calculator Application 
*/

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.stage.Stage;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.scene.layout.HBox; 
import javafx.event.EventHandler; 
import javafx.event.ActionEvent;
  
public class CalculatorJavaFX extends Application {  
	String value;
    String math;
    double num1, num2, result;
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // Text Field
        TextField jtfSpace = new TextField();
          
        // Button Field
        Button bOne = new Button("1");
        Button bTwo = new Button("2");
        Button bThree = new Button("3");
        Button bFour = new Button("4");
        Button bFive = new Button("5");
        Button bSix = new Button("6");
        Button bSeven = new Button("7");
        Button bEight = new Button("8");
        Button bNine = new Button("9");
        Button bZero = new Button("0");
		Button bAdd = new Button("+");
        Button bSub = new Button("-");
        Button bMul = new Button("*");
        Button bDiv = new Button("/");
		Button bEqual = new Button("=");
        Button bDot = new Button(".");
		
		bOne.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "1");
             }
        });
		bTwo.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "2");
             }
        });
		bThree.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "3");
             }
        });
		bFour.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "4");
             }
        });
		bFive.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "5");
             }
        });
		bSix.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "6");
             }
        });
		bSeven.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "7");
             }
        });
		bEight.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "8");
             }
        });
		bNine.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "9");
             }
        });	
		bZero.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + "0");
             }
        });	
		bDot.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                jtfSpace.setText(jtfSpace.getText() + ".");
             }
        });			 
		bAdd.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                math = "Add";
                value = jtfSpace.getText();
                num1 = Double.parseDouble(value);
                jtfSpace.setText("");
             }
        });	
		bSub.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                math = "Sub";
                value = jtfSpace.getText();
                num1 = Double.parseDouble(value);
                jtfSpace.setText("");
             }
        });	
		bMul.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                math = "Mul";
                value = jtfSpace.getText();
                num1 = Double.parseDouble(value);
                jtfSpace.setText("");
             }
        });	
		bDiv.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                math = "Div";
                value = jtfSpace.getText();
                num1 = Double.parseDouble(value);
                jtfSpace.setText("");
             }
        });

		bEqual.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                value = jtfSpace.getText();
                num2 = Double.parseDouble(value);
                switch (math) {
                    case "Div": result = num1 / num2;
                    case "Mul": result = num1 * num2;
                    case "Add": result = num1 + num2;
                    case "Sub": result = num1 - num2;
                }
                jtfSpace.setText("" + result);		 
             }
        });
		 
        GridPane root=new GridPane();  
		HBox root2_1 = new HBox();
		HBox root2_2 = new HBox();
		HBox root2_3 = new HBox();
		HBox root2_4 = new HBox();
        Scene scene = new Scene(root, 150, 135);  
		
        root.addRow(0, jtfSpace);
        root.addRow(1, root2_4);
		root.addRow(2, root2_3);
		root.addRow(3, root2_2);
		root.addRow(4, root2_1);
		root2_1.getChildren().addAll(bZero, bDot, bEqual, bAdd);   
        root2_2.getChildren().addAll(bOne,  bTwo, bThree, bSub);   
		root2_3.getChildren().addAll(bFour, bFive, bSix, bMul);   
		root2_4.getChildren().addAll(bSeven, bEight, bNine, bDiv);   
		
        primaryStage.setScene(scene);  
		primaryStage.setTitle("Calculator");  
        primaryStage.show();  
    }  
    public static void main(String[] args) {  
        Application.launch(args);  
    }  
      
}
