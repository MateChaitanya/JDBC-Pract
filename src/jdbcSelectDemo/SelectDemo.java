package jdbcSelectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {

	public static void main(String[]args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Chaitu@123");
		
		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String name1 = rs.getString("name");
			System.out.println(name1);
		}
		
		
	}
}
