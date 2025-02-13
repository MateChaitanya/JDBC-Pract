package jdbcInsertDemo;

import java.sql.DriverManager;

public class InsertDemo {

	public static void main(String[]args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Chaitu@123");
		System.out.print("Success");
	}
}
