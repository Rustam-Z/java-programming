import java.io.*;
import java.net.*;
import java.util.Scanner;  

public class ClientAB {
	private DataOutputStream toServer;
	private DataInputStream fromServer;

	public static void main(String[] args) {    
		new ClientAB();
	}

	public ClientAB() {
		try {
      		// Create a socket to connect to the server
      		Socket socket = new Socket("localhost", 8000);
      
			Scanner sc = new Scanner(System.in);  
			System.out.println("Please Enter radius");  
			Double radius = sc.nextDouble();  
			   
   			while(radius != 0){
				// Create an input stream to receive data from the server
				fromServer = new DataInputStream(socket.getInputStream());

				// Create an output stream to send data to the server
				toServer = new DataOutputStream(socket.getOutputStream());
				toServer.writeDouble(radius);
        		toServer.flush();
				double area = fromServer.readDouble();

   				System.out.println("Please area of cirlce" + area);  
				System.out.println("Please Enter radius");  
    			radius = sc.nextDouble();
			}
	
		} catch (IOException ex) {
      			System.out.println(ex.toString() + '\n');
    	}
  	}
}