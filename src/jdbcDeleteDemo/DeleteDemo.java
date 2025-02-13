package jdbcDeleteDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
    public static void main(String[] args) throws Exception {
        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Chaitu@123");

        // Prepare the SQL DELETE statement
        PreparedStatement ps = con.prepareStatement("DELETE FROM register WHERE email = ?");
        ps.setString(1, "ganesh@example.com");

        // Execute the delete query
        ps.executeUpdate();

        // Close the connection
        con.close();

        System.out.println("Record deleted successfully.");
    }
}
