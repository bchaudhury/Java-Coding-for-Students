// Inserting records into the table

package SQL;

// Attach external library mysql-connector-j-9.2.2.jar or latest version
// Importing required libraries
import java.sql.*;

public class InsertRecords {
   
   // JDBC driver name, UserID, Password and database URL
   static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS"; 
   static final String USER = "root";
   static final String PASS = "Bhas@123abc#";

    // Main method
   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table...");  
         // Inserting records into the table
         String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
         // Execute a query
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(sql);

         // Displaying that records have been inserted
         System.out.println("Inserted few records into the table...");  
         
         // Close resources
         conn.close();
         stmt.close();

      } catch (SQLException e) {
         // Handle errors for JDBC
         e.printStackTrace();
      }
   }
}
