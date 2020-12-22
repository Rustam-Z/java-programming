import java.sql.*;   // Use 'Connection', 'Statement' and 'ResultSet' classes in java.sql package
 
// JDK 1.7 and above
public class JdbcSelectTest_insert {   // Save as "JdbcSelectTest.java"
    public static void main(String[] args) {
      try (
        // Step 1: Allocate a database 'Connection' object
        Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/IUT_DB?autoReconnect=true&useSSL=false", "root", "1234");
        // MySQL: "jdbc:mysql://hostname:port/databaseName", "username", "password"
 
        // Step 2: Allocate a 'Statement' object in the Connection
        Statement stmt = conn.createStatement();) {
        // Step 3: Execute a SQL SELECT query, the query result
        // is returned in a 'ResultSet' object.
        int sid=999;
        String sname="Muhaamad";

        String strSelect = "insert into student values (" +sid+","+"'" +sname+"')";

        System.out.println("The SQL query is: " + strSelect); // Echo For debugging
        System.out.println();

        int count = stmt.executeUpdate(strSelect);

        // Step 4: Process the ResultSet by scrolling the cursor forward via next().
        // For each row, retrieve the contents of the cells with getXxx(columnName).
        conn.close();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        // Step 5: Close the resources - Done automatically by try-with-resources
   }
}

// to delete record
// String strSelect = "delete from student where studentid ="+ sid;	
