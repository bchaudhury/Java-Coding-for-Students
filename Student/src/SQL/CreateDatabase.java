package SQL;

import java.sql.*;

public class CreateDatabase {
    
   static final String DB_URL = "jdbc:mysql://localhost:3306/";
   static final String USER = "root";
   static final String PASS = "Bhas@123abc#";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "CREATE DATABASE STUDENTS";
         stmt.executeUpdate(sql);
         System.out.println("Database created successfully...");  
         
         conn.close();
         stmt.close();
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
