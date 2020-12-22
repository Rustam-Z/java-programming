// information to run this program
// to compile the program
// javac JDBCExample.java
// first method
// to run the program
// java -cp "C:\mysql-connector-java-5.1.49\mysql-connector-java-5.1.49-bin.jar;" JDBCExample
// or
// second method
// set path 
// set path=%path%;C:\mysql-connector-java-5.1.49;
// java JDBCExample
// either your can use hostname 127.0.0.1 or localhost

// default port number  3306

import java.sql.Connection; // to establish a connection
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html#package.description
        // auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver class via Class.forName

        // register JDBC driver, optional since java 1.6
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        // auto close connection
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/IUT_DB?autoReconnect=true&useSSL=false", "root", "1234")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
