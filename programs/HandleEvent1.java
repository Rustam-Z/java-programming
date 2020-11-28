package programs;

import javax.swing.*;
import java.awt.event.*;

public class HandleEvent1 extends JFrame
{
	JButton jbtOK = new JButton("OK");
    JButton jbtCancel = new JButton("Cancel");

  	public HandleEvent1() {    
    	// Create a panel to hold buttons
    	JPanel panel = new JPanel();
    	panel.add(jbtOK);
    	panel.add(jbtCancel);

    	add(panel); // Add panel to the frame

    	// Register listeners
    	ListenerClass listener = new ListenerClass();
    
    	jbtOK.addActionListener(listener);
    	jbtCancel.addActionListener(listener);
  	}
  
  	public static void main(String[] args) {
    	JFrame frame = new HandleEvent1();
    	frame.setTitle("Handle Event");
    	frame.setSize(400, 400);
    	frame.setLocation(200, 100);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
      
	class ListenerClass implements ActionListener {
  		public void actionPerformed(ActionEvent e) {
 			if (e.getSource() == jbtOK)
        		System.out.println("OK button clicked");
      		else if (e.getSource() == jbtCancel)
    			System.out.println("Cancel button clicked");
  	    }
	}
}
