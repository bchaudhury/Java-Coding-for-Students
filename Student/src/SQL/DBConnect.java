// Attach external library mysql-connector-j-9.2.2.jar or latest version
package SQL;

import java.sql.*;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

public class DBConnect {

	public static void main(String[] args) {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydatabase", "root", "Bhas@123abc#");
            
            // Create a statement
            Statement st = con.createStatement();
            
            // Execute a query
            String sql = "SELECT * FROM customers";
            ResultSet rs = st.executeQuery(sql);
            
            // Process the results
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name") +
                                   ", Address: " + rs.getString("address"));
            }
            
            // Close resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
