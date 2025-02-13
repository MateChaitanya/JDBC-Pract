package jdbcInsertDemo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class InsertDemo {

	public static void main(String[]args)throws Exception{
		
		//Step 1 - Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//Step 2 - Create a Connection 
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Chaitu@123");
		
		
		//Step 3- Create Statement 
		PreparedStatement ps = con.prepareStatement("INSERT INTO register (name, email, password, phone) VALUES ('Jailin', 'jailin@example.com', 'jailin123', '9234558460')");
		//step 4 - Execute SQL Statement
		ps.executeUpdate();

	}
}
