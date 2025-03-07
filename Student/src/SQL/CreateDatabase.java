// Create a database in MySQL using JDBC
// Importing required libraries

package SQL;

// Attach external library mysql-connector-j-9.2.2.jar or latest version
import java.sql.*;

// Main class
public class CreateDatabase {
   // JDBC driver name, database URL, User and Password
   static final String DB_URL = "jdbc:mysql://localhost:3306/";
   static final String USER = "root";
   static final String PASS = "Bhas@123abc#";

      // Main method
      public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {
         // Execute a query
         System.out.println("Creating database...");		      
         String sql = "CREATE DATABASE STUDENTS";
         
         stmt.executeUpdate(sql);
         System.out.println("Database created successfully...");  
         
         // Close resources
         conn.close();
         stmt.close();
         
      } catch (SQLException e) {
         // Handle errors for JDBC
         e.printStackTrace();
      }
   }
}
