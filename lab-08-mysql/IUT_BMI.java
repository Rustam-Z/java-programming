import java.util.Scanner; // Import the Scanner class
import java.sql.*; // Use 'Connection', 'Statement' and 'ResultSet' classes in java.sql package

public class IUT_BMI {
    public static void main(String[] args) {

        try (
            // Allocate a database 'Connection' object
            Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/IUT_BMI?autoReconnect=true&useSSL=false", "root", "1234");
    
            // Allocate a 'Statement' object in the Connection
            Statement stmt = conn.createStatement();
            ) {

                Scanner input = new Scanner(System.in); // Create a Scanner object
                int option, isExit; // Initializing some variables

                int employeeID, employeeHeight, employeeWeight;
                String employeeName;
                
                do { // Loop for reusing the program
                    option = showMenu(); // The option value
        
                    switch (option){
                        case 1:
                        System.out.println("***** DISPLAY RECORDS *****");
                        // Execute a SQL SELECT query, the query result is returned in a 'ResultSet' object.
                        String strSelect = "SELECT * FROM Employee_BMI; ";
                        System.out.println("The SQL query is: " + strSelect); // Echo For debugging
                        System.out.println();

                        ResultSet rset = stmt.executeQuery(strSelect);

                        // Process the ResultSet by scrolling the cursor forward via next().
                        // For each row, retrieve the contents of the cells with getXxx(columnName).
                        System.out.println("The records selected are:");
                        int rowCount = 0;

                        while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                            employeeID = rset.getInt("employeeID"); 
                            employeeHeight = rset.getInt("employeeHeight"); 
                            employeeWeight = rset.getInt("employeeWeight");
                            employeeName = rset.getString("employeeName");
                            
                            System.out.println(employeeID + " " + employeeName + " " + employeeHeight + " " + employeeWeight );
                            rowCount++;
                        }
                        System.out.println("Total number of records = " + rowCount);
                        break;

                    case 2:
                        System.out.println("***** INSERT RECORD *****");
                        //Execute a SQL SELECT query, the query result is returned in a 'ResultSet' object.
                        System.out.print("Employee ID: "); employeeID = (input.nextInt());							
                        System.out.print("Employee height: "); employeeHeight = (input.nextInt());
                        System.out.print("Employee weight: "); employeeWeight = (input.nextInt());
                        System.out.print("Employee name: "); employeeName = (input.next());
							
						strSelect = "INSERT INTO Employee_BMI VALUES(" + employeeID + "," + "'" + employeeName + "'," + " "  + employeeHeight+"," + " " + employeeWeight+")";
						
                        System.out.println("The SQL query is: " + strSelect); // Echo For debugging
					 
						int count = stmt.executeUpdate(strSelect);

                        break;

                    case 3:
                        System.out.println("***** UPDATE RECORD *****");
                        // Execute a SQL SELECT query, the query result is returned in a 'ResultSet' object.
                        System.out.print("Employee ID: "); employeeID = (input.nextInt());							
                        System.out.print("Employee height: "); employeeHeight = (input.nextInt());
                        System.out.print("Employee weight: "); employeeWeight = (input.nextInt());

                        // SQL query to update record
                        strSelect ="UPDATE Employee_BMI SET employeeWeight=" + employeeWeight + ", employeeHeight=" + employeeHeight + " WHERE employeeID="+ employeeID;
                    
                        System.out.println("The SQL query is: " + strSelect); // Echo For debugging
					 
						count= stmt.executeUpdate(strSelect);

                        break;

                    case 4:
                        System.out.println("***** DELETE RECORD *****");
                        // Execute a SQL SELECT query, the query result is returned in a 'ResultSet' object.
                        System.out.print("Employee ID: "); employeeID = (input.nextInt());							
                        
                        // to delete record
                        strSelect ="DELETE FROM Employee_BMI WHERE employeeID=" + employeeID;
                    
                        System.out.println("The SQL query is: " + strSelect); // Echo For debugging
                        System.out.println();
                    
                        count = stmt.executeUpdate(strSelect);
                        break;

                    case 0:
                        System.out.println("Quitting Program...");
                        System.exit(0); // program ends
                        break;
                    default:
                        System.out.println("Please choose a valid option!");
                
                    } // End of switch
        
                    System.out.print("\nDo you want to continue? (0.No 1.Yes) - ");
                    isExit = input.nextInt(); // validation checking
        
                } while(isExit == 1);
                
      
            } catch(SQLException ex) {
                ex.printStackTrace();
            } 

    } // end of main()

    public static int showMenu() {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        int option = 0;
        // Printing menu to screen
        System.out.println("\n***** MAIN MENU *****");
        System.out.println("1. Display records");
        System.out.println("2. Insert record");
        System.out.println("3. Update record");
        System.out.println("4. Delete record");
        System.out.println("0. Exit");

        // Getting user option from above menu
        System.out.print("Your choice: ");
        option = input.nextInt();
        System.out.println();

        return option;
    } // End of showMenu 
}
