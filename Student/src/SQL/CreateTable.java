package SQL;

import java.sql.*;

public class CreateTable {

   static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
   static final String USER = "root";
   static final String PASS = "Bhas@123abc#";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Table Created Successfully...");   
         
         String sqlShow="SHOW TABLES";
         ResultSet rs = stmt.executeQuery(sqlShow);
         while(rs.next()){
                System.out.println(rs.getString(1));
            }
            
         conn.close();
         stmt.close();
         rs.close();

      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
