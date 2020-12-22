/**
 * Student: Rustam Zokirov
 * ID: U1910049
 * Lab #9: Networking, socket programming
 * Client side
 */

// import libraries we need
import java.io.*; // DataInputStream/DataOutputStream
import java.net.*; // ServerSocket/Socket
import java.util.Scanner;  

public class Client {
	private DataOutputStream toServer;
	private DataInputStream fromServer;

	public static void main(String[] args) {    
		new Client();
	}

	public Client() { // constructor
		try {
      		// Create a socket to connect to the server
      		Socket socket = new Socket("localhost", 8000);
      
            Scanner sc = new Scanner(System.in);  
            String message;

            do {
                System.out.print("Please enter a message (0 = exit): ");  
                message = sc.next();  
                
                if (message.compareTo("0") == 0) 
                    break;
                
                // Create an input stream to receive data from the server
				fromServer = new DataInputStream(socket.getInputStream());

				// Create an output stream to send data to the server
				toServer = new DataOutputStream(socket.getOutputStream());
				toServer.writeUTF(message);
                toServer.flush();
                
				String convertedMessage = fromServer.readUTF();

                System.out.println("Converted message: " + convertedMessage); 
                System.out.println();

            } while(true);
            
        } 
        catch (IOException ex) {
      			System.out.println(ex.toString() + '\n');
    	}
  	}
}
