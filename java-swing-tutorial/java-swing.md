## Java Swing
### GUI Basics
- [Lecture Notes](lecture-notes/GUI_Basics.ppt)

- [Swing Notes](lecture-notes/Creating_User_Interfaces_Swing.ppt)

- Swing (interface) vs. AWT (event handling)

-	```java
	import javax.swing.*;
	
	public class MyFrame {
		public static void main(String[] args) {
			JFrame frame = new JFrame("Test Frame");
			frame.setSize(400, 300);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	```

- 	```java
	import javax.swing.*;

	public class MyFrameWithComponents { 
		public static void main(String[] args) { 
			JFrame frame = new JFrame( "MyFrameWithComponen")

			JButton jbtOK = new JButton("OK"); // Add a button into the frame 
			frame.add(jbtOK); 

			frame.setSize(400, 300); 
			frame.setDefau1tC10seOperation(JFrame.EXIT_ON_CLOSE); 
			frame.setLocationRe1ativeTo(nu11); // Center the frame 
			frame.setVisib1e(true);
		}
	}
	```
- [JFrame with inheritence](programs/MyFrame1.java)

### Layout Manager
- For arraning a position into containers

- [FlowLayout](programs/ShowFlowLayout.java)

- [GridLayout](programs/ShowGridLayout.java)

- [BorderLayout](programs/ShowBorderLayout.java)

- `Color` class
	- ```java
	  Color mycolor = new Color(228, 100, 50);
	  // how to set for button
	  mybutton.setBackground(Color.mycolor);
	  mybutton.setForeground(Color.mycolor);
	  ```

### JPanel
- In `JFrame` we add a component `JPanel`

- [TestPanels](programs/TestPanels.java)

### Event-Handling in Java (Event-Driven Programming)

- [Lecture Notes](lecture-notes/Event-Driven_Programming.ppt)

- Event-driven programming (depends of action) <-> procedural programming (step by step)

- [HandleEvent](programs/HandleEvent.java)

- [HandleEvent1](programs/HandleEvent1.java) with the use of Inner Classes

-	```
	User Action			Object			Generated

	Click a button			JButton			ActionEvent
	Click a check box		JCheckBox		ItemEvent, ActionEvent
	Click a radio button		JRadioButton		ItemEvent, ActionEvent
	Press return on a text field	JTextField		ActionEvent
	Select a new item		JComboBox		ItemEvent, ActionEvent
	Window opened, closed, etc.	Window			WindowEvent 
	Mouse pressed, released, etc.	Component		MouseEvent 
	Key released, pressed, etc. 	Component		KeyEvent 
	```

-	```
	Event Class		Listener Interface	Listener Methods (Handlers)
	ActionEvent		ActionListener		actionPerformed(ActionEvent)
	ItemEvent		ItemListener		itemStateChanged(ItemEvent)
	WindowEvent		WindowListener		windowClosing(WindowEvent)
							windowOpened(WindowEvent)
							windowIconified(WindowEvent)
							windowDeiconified(WindowEvent)
							windowClosed(WindowEvent)
							windowActivated(WindowEvent)
							windowDeactivated(WindowEvent)
	ContainerEvent		ContainerListener	componentAdded(ContainerEvent)
							componentRemoved(ContainerEvent) 
	MouseEvent		MouseListener		mousePressed(MouseEvent)
							mouseReleased(MouseEvent) 
							mouseClicked(MouseEvent)
							mouseExited(MouseEvent)	
							mouseEntered(MouseEvent)
	KeyEvent		KeyListener		keyPressed(KeyEvent)
							keyReleased(KeyEvent) 
							keyTypeed(KeyEvent)

	```
