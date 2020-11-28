package programs;

import javax.swing.*;

public class MyFrameWithComponents { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame( "MyFrameWithComponen");

        JButton jbtOK = new JButton("OK"); // Add a button into the frame 
        frame.add(jbtOK); // or we can use frame.add(new Button("OK"))

        frame.setSize(400, 300); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null); // Center the frame 
        frame.setVisible(true);
    }
}