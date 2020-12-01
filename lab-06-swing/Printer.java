/**
 * Rustam Zokirov, U1910049
 * Working with Layouts
 */
import javax.swing.*; // import library to work with GUI

public class Printer extends JFrame { // inherit JFrame
    public static void main(String[] args) {
        // Labels
        JLabel jlblPrinter = new JLabel("Printer: My Printer");
        jlblPrinter.setBounds(30, 10, 150, 20); // set the coordinates, length and width
        JLabel jlblQuality = new JLabel("Print Quality:");
        jlblQuality.setBounds(30, 100, 150, 20); // set the coordinates, length and width

        // Text areas
        JTextArea jtxtFirst = new JTextArea();
        jtxtFirst.setBounds(25, 35, 50, 60);
        JTextArea jtxtSecond = new JTextArea();
        jtxtSecond.setBounds(150, 35, 40, 60);
        JTextArea jtxtThird = new JTextArea();
        jtxtThird.setBounds(270, 35, 50, 60);

        // Check box
        JCheckBox checkBox1 = new JCheckBox("Image", true);  
        checkBox1.setBounds(75, 37, 60, 15);  
        JCheckBox checkBox2 = new JCheckBox("Text");  
        checkBox2.setBounds(75, 57, 60, 15); 
        JCheckBox checkBox3 = new JCheckBox("Code");  
        checkBox3.setBounds(75, 77, 60, 15);  
        JCheckBox printFileBox = new JCheckBox("Print to file");
        printFileBox.setBounds(195, 100, 120, 20);

        // Radio Buttons
        JRadioButton radioButton1 = new JRadioButton("Selection");
        radioButton1.setBounds(190, 37, 80, 15);
        JRadioButton radioButton2 = new JRadioButton("All", true);
        radioButton2.setBounds(190, 57, 80, 15);
        JRadioButton radioButton3 = new JRadioButton("Applet");
        radioButton3.setBounds(190, 77, 80, 15);

        // ComboBox
        String quality[] = {"High","Medium","Low"}; // array which contatins all the choices      
        JComboBox comboBox = new JComboBox(quality);    
        comboBox.setBounds(115, 100, 70, 20);    

        // Buttons
        JButton jbtOkButton = new JButton("Ok");
        jbtOkButton.setBounds(330, 20, 75, 25);
        JButton jbtCancelButton = new JButton("Cancel");
        jbtCancelButton.setBounds(330, 50, 75, 25);
        JButton jbtSetupButton = new JButton("Setup");
        jbtSetupButton.setBounds(330, 80, 75, 25);
        JButton jbtHelpButton = new JButton("Help");
        jbtHelpButton.setBounds(330, 110, 75, 25);

        // Create Frame
        JFrame frame = new Printer();
        frame.add(jlblPrinter);
        frame.add(jlblQuality);
        
        frame.add(jtxtFirst);
        frame.add(jtxtSecond);
        frame.add(jtxtThird);

        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(printFileBox);

        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);

        frame.add(comboBox);

        frame.add(jbtOkButton);
        frame.add(jbtCancelButton);
        frame.add(jbtSetupButton);
        frame.add(jbtHelpButton);

        // Some settings
        frame.setTitle("Printer");
        frame.setLayout(null);
    	frame.setSize(450, 200);
    	frame.setLocation(200, 100);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}
