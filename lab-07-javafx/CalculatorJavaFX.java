/*
By Rustam Zokirov,
U1910049
Lab: #7
Calculator Application 
*/

// import libraries
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
	String value; // text value
    String math; // calculations, +, -, *, /
    double num1, num2, result; // number 1, number 2, result
  
    @Override  
    public void start(Stage stage) throws Exception {  
        // Text
        TextField textField = new TextField();
          
        // Buttons
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

		// lambdas
        bZero.setOnAction(e -> textField.setText(textField.getText() + "0"));	
        bOne.setOnAction(e ->  textField.setText(textField.getText() + "1")); 
		bTwo.setOnAction(e -> textField.setText(textField.getText() + "2"));
		bThree.setOnAction(e -> textField.setText(textField.getText() + "3"));
		bFour.setOnAction(e -> textField.setText(textField.getText() + "4"));
		bFive.setOnAction(e -> textField.setText(textField.getText() + "5"));
		bSix.setOnAction(e -> textField.setText(textField.getText() + "6"));
		bSeven.setOnAction(e -> textField.setText(textField.getText() + "7"));
		bEight.setOnAction(e -> textField.setText(textField.getText() + "8"));
		bNine.setOnAction(e -> textField.setText(textField.getText() + "9"));	
        bDot.setOnAction(e -> textField.setText(textField.getText() + "."));	
        		 
		bAdd.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                math = "Add";
                value = textField.getText();
                num1 = Double.parseDouble(value);
                textField.setText("");
             }
        });	
		bSub.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                math = "Sub";
                value = textField.getText();
                num1 = Double.parseDouble(value);
                textField.setText("");
             }
        });	
		bMul.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                math = "Mul";
                value = textField.getText();
                num1 = Double.parseDouble(value);
                textField.setText("");
             }
        });	
		bDiv.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                math = "Div";
                value = textField.getText();
                num1 = Double.parseDouble(value);
                textField.setText("");
             }
        });

		bEqual.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                value = textField.getText();
                num2 = Double.parseDouble(value); // get the last value
                switch (math) {
                    case "Div": result = num1 / num2; 
                        break;
                    case "Mul": result = num1 * num2;
                        break;
                    case "Add": result = num1 + num2; 
                        break;
                    case "Sub": result = num1 - num2; 
                        break;
                }
                textField.setText("" + result);		 
             }
        });

		// set layout to gridpane 
        GridPane gridPane = new GridPane();  

        gridPane.add(textField, 0, 0);

        gridPane.add(bSeven, 1, 0);
        gridPane.add(bEight, 1, 1);
        gridPane.add(bNine, 1, 2);
        gridPane.add(bDiv, 1, 3);

        gridPane.add(bFour, 2, 0);
        gridPane.add(bFive, 2, 1);
        gridPane.add(bSix, 2, 2);
        gridPane.add(bMul, 2, 3);

        gridPane.add(bOne, 3, 0);
        gridPane.add(bTwo, 3, 1);
        gridPane.add(bThree, 3, 2);
        gridPane.add(bSub, 3, 3);

        gridPane.add(bZero, 4, 0);
        gridPane.add(bDot, 4, 1);
        gridPane.add(bEqual, 4, 2);
        gridPane.add(bAdd, 4, 3);

        Scene scene = new Scene(gridPane);  
	
        stage.setScene(scene);  
        stage.setTitle("Calculator");  
        stage.show();  
    }  
    public static void main(String[] args) {  
        Application.launch(args); // running
    }  
}
