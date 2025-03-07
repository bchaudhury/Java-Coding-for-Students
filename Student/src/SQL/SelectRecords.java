// Program to select records from the table 'Registration' in the database 'STUDENTS'
// Importing required libraries

package SQL;

import java.sql.*;

public class SelectRecords {
    // JDBC driver name, database URL, User and Password
   static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
   static final String USER = "root";
   static final String PASS = "Bhas@123abc#";
   static final String QUERY = "SELECT id, first, last, age FROM Registration"
                                + " WHERE first LIKE '%za%'";

    // Main method
    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {		      
            // Execute a query
            System.out.println("Fetching records ...");  
            ResultSet rs = stmt.executeQuery(QUERY);
            
            // Extract data from result set
            while(rs.next()){
                // Retrieve by column name
                int id  = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");
    
                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First Name: " + first);
                System.out.println(", Surname: " + last);
            }

            // Close resources
            rs.close();
            conn.close();
            stmt.close();

        } catch (SQLException e) {

            // Handle errors for JDBC
            e.printStackTrace();

        } 
    }
   
}
