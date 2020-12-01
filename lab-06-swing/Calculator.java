/*
By Rustam Zokirov,
U190049
Lab: #6 
Calculator Application 
*/

// import some libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
	JTextField jtxtField = new JTextField(); // text field
	JButton jbt0Button = new JButton("0"); // some buttons from 0-9
	JButton jbt1Button = new JButton("1");
	JButton jbt2Button = new JButton("2");
	JButton jbt3Button = new JButton("3");
	JButton jbt4Button = new JButton("4");
	JButton jbt5Button = new JButton("5");
	JButton jbt6Button = new JButton("6");
	JButton jbt7Button = new JButton("7");
	JButton jbt8Button = new JButton("8");
	JButton jbt9Button = new JButton("9");
	JButton jbtDeleteButton = new JButton("/"); // operations
	JButton jbtMultiplyButton = new JButton("*");
	JButton jbtMinusButton = new JButton("-");
	JButton jbtPlusButton = new JButton("+");
	JButton jbtEqualButton = new JButton("=");
	JButton jbtDotButton = new JButton(".");
	
  	public Calculator() {    
		// Panel for the text field
		JPanel panel_text = new JPanel();
		panel_text.setLayout(new BorderLayout()); // implementing BorderLayout
		panel_text.add(jtxtField, BorderLayout.NORTH);

    	// Create a panel to hold buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4)); // implementing GridLayout 4 by 4
		panel.add(jbt7Button);
		panel.add(jbt8Button);
    	panel.add(jbt9Button);
    	panel.add(jbtDeleteButton);
    	panel.add(jbt4Button);
    	panel.add(jbt5Button);
    	panel.add(jbt6Button);
    	panel.add(jbtMultiplyButton);
    	panel.add(jbt1Button);
    	panel.add(jbt2Button);
    	panel.add(jbt3Button);
    	panel.add(jbtMinusButton);
    	panel.add(jbt0Button);
		panel.add(jbtDotButton);
    	panel.add(jbtEqualButton);
		panel.add(jbtPlusButton);
		
		panel_text.add(panel, BorderLayout.CENTER);
		add(panel_text); // Add panel to the frame

    	// Register listeners
    	ListenerClass listener = new ListenerClass();
		jbt0Button.addActionListener(listener);
    	jbt1Button.addActionListener(listener);
    	jbt2Button.addActionListener(listener);
    	jbt3Button.addActionListener(listener);
    	jbt4Button.addActionListener(listener);
    	jbt5Button.addActionListener(listener);
    	jbt6Button.addActionListener(listener);
    	jbt7Button.addActionListener(listener);
    	jbt8Button.addActionListener(listener);
		jbt9Button.addActionListener(listener);
		jbtPlusButton.addActionListener(listener);
		jbtMinusButton.addActionListener(listener);
		jbtMultiplyButton.addActionListener(listener);
		jbtDeleteButton.addActionListener(listener);
		jbtEqualButton.addActionListener(listener);
		jbtDotButton.addActionListener(listener);
  	}
  
  	public static void main(String[] args) {
    	JFrame frame = new Calculator(); // creating object 
		frame.setTitle("Handle Event");
    	frame.setSize(200, 200); // set size
    	frame.setLocation(200, 100); // set location in window
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
	  
	// ListenerClass - Inner Class for handing the actions
	class ListenerClass implements ActionListener {
		char operation; // operation
		double num1; // number 1
		double num2; // number 2
		double result; // result 

  		public void actionPerformed(ActionEvent e) {
			// handle the text field
			if (e.getSource() == jbt0Button) 
			 	jtxtField.setText(jtxtField.getText() + '0');
			else if (e.getSource() == jbt1Button) 
				jtxtField.setText(jtxtField.getText() + '1');
			else if (e.getSource() == jbt2Button) 
				jtxtField.setText(jtxtField.getText() + '2');	
			else if (e.getSource() == jbt3Button) 
				jtxtField.setText(jtxtField.getText() + '3');					 
			else if (e.getSource() == jbt5Button) 
				jtxtField.setText(jtxtField.getText() + '5');				
			else if (e.getSource() == jbt6Button) 
				jtxtField.setText(jtxtField.getText() + '6');	
			else if (e.getSource() == jbt7Button) 
				jtxtField.setText(jtxtField.getText() + '7');	
			else if (e.getSource() == jbt8Button) 
				jtxtField.setText(jtxtField.getText() + '8');	
			else if (e.getSource() == jbt9Button) 
				jtxtField.setText(jtxtField.getText() + '9');	
			else if (e.getSource() == jbtDotButton) 
				jtxtField.setText(jtxtField.getText() + '.');
			else if (e.getSource() == jbtPlusButton) {
				operation = '+';
			    num1 = Double.parseDouble(jtxtField.getText());
				jtxtField.setText("");
			}
			else if (e.getSource() == jbtMinusButton) {
				operation = '-';
			    num1 = Double.parseDouble(jtxtField.getText());
				jtxtField.setText("");
			}
			else if (e.getSource() == jbtMultiplyButton) {
				operation = '*';
			    num1 = Double.parseDouble(jtxtField.getText());
				jtxtField.setText("");
			}
			else if (e.getSource() == jbtDeleteButton) {
				operation = '/';
			    num1 = Double.parseDouble(jtxtField.getText());
				jtxtField.setText("");
			}
			else if (e.getSource() == jbtEqualButton) {
				num2 = Double.parseDouble(jtxtField.getText());

				// handle calculation
				if (operation == '+') 
					result = num1 + num2;
				else if (operation == '-')
					result = num1 - num2;
				else if (operation == '*')
					result = num1 * num2;
				else if (operation == '/')
					result = num1 / num2;

				jtxtField.setText(Double.toString(result)); // ouput the resust				
			}
  	    }
	} // ListenerClass
} // Calculator 
