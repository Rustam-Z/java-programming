/**
 * Student: Rustam Zokirov
 * ID: U1910049
 * Lab #9: Networking, socket programming
 * Server side
 */

// import libraries
import java.io.*; // DataInputStream/DataOutputStream
import java.net.*; // ServerSocket/Socket
import java.util.*;

public class Server {
  
	public static void main(String[] args) {
    	new Server();
	}

	public Server() { // constructor
    	try {
			// Create a server socket
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("Server started at " + new Date() + '\n');

			// Listen for a connection request
			Socket socket = serverSocket.accept();

			// Create data input and output streams
			DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
			DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

      		while (true) {
				// Receive radius from the client
				String message = inputFromClient.readUTF();

				InetAddress ip = socket.getInetAddress(); 
  				System.out.println("Host Name: " + ip.getHostName());  
				System.out.println("IP Address: " + ip.getHostAddress());  
				System.out.println("We have received message: " + message);
        			
				// Convert to upper case
				String convertedMessage = message.toUpperCase();

				// Send message back to the client
				outputToClient.writeUTF(convertedMessage);
 			}
        } 
        catch(IOException ex) {
      		System.err.println(ex);
    	} 
  	}
}