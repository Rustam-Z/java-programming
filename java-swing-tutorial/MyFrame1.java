package programs;

import javax.swing.*;

public class MyFrame1 extends JFrame {

    public MyFrame1() {
        super("MyFrame");

        setSize(400, 300); // Set the frame size
        setLocationRelativeTo(null); // New since JDK 1 s
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // Display the frame
    }

    public static void main(String[] args) { 
        MyFrame1 frame = new MyFrame1(); // Create a frame
    }
}