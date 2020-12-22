import java.io.*;
import java.net.*;
import java.util.*;

public class ServerAB {
  
	public static void main(String[] args) {
    		new ServerAB();
	}

	public ServerAB() { // constructor
    	try {
			// Create a server socket
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("Server started at " + new Date() + '\n');

			// Listen for a connection request
			Socket socket = serverSocket.accept();

			// Create data input and output streams
			DataInputStream inputFromClient = new DataInputStream(
			socket.getInputStream());
			DataOutputStream outputToClient = new DataOutputStream(
			socket.getOutputStream());

      		while (true) {
				// Receive radius from the client
				double radius = inputFromClient.readDouble();

				InetAddress ip = socket.getInetAddress(); 
  				System.out.println("Host Name: " + ip.getHostName());  
				System.out.println("IP Address: " + ip.getHostAddress());  
				System.out.println("We have received radius value "+ radius);
        			
				// Compute area
				double area = radius * radius * Math.PI;

				// Send area back to the client
				outputToClient.writeDouble(area);
 			}
    	} catch(IOException ex) {
      		System.err.println(ex);
    	} 
  	}
}