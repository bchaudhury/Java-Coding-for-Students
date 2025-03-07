// Update records in the table 'Registration' in the database 'STUDENTS'
// Importing required libraries

package SQL;

import java.sql.*;

public class UpdateRecords {

    // JDBC driver name, database URL, User and Password
    static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
    static final String USER = "root";
    static final String PASS = "Bhas@123abc#";
    static final String QUERY = "SELECT id, first, last, age FROM Registration";
 
    // Main method
    public static void main(String[] args) {
       // Open a connection
       try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
       ) {	
          // Execute a query	
          System.out.println("Updating records in the table...");      
          String sql = "UPDATE Registration " +
             "SET age = 24 WHERE id in (100, 101)";
          stmt.executeUpdate(sql);
          ResultSet rs = stmt.executeQuery(QUERY);

          // Extract data from result set
          while(rs.next()){
             //Display values
             System.out.print("ID: " + rs.getInt("id"));
             System.out.print(", Age: " + rs.getInt("age"));
             System.out.print(", First: " + rs.getString("first"));
             System.out.println(", Last: " + rs.getString("last"));
          }

          // Close resources
          rs.close();
          conn.close();
          stmt.close();

          } catch (SQLException e) {
             e.printStackTrace();
          } 

    }

}
