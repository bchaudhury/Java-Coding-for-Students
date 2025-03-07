package SQL;

// Attach external library mysql-connector-j-9.2.2.jar or latest version
// Importing required libraries

import java.sql.*;

public class CreateTable {
   // JDBC driver name, database URL, User and Password
   static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
   static final String USER = "root";
   static final String PASS = "Bhas@123abc#";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		  
         // Execute a query
         System.out.println("Creating table in given database...");     
         String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

         // Execute a query
         stmt.executeUpdate(sql);
         System.out.println("Table Created Successfully...");   
         
         // Show all the tables
         String sqlShow="SHOW TABLES";
         ResultSet rs = stmt.executeQuery(sqlShow);
         while(rs.next()){
                System.out.println(rs.getString(1));
            }
         
         // Close resources   
         conn.close();
         stmt.close();
         rs.close();

      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
