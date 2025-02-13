package jdbcUpdateDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

    public static void main(String[] args) throws Exception {
        String phone1 = "7972763581";
        String email1 = "jailin@example.com"; // Ensure the correct email from the table

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Chaitu@123");

        PreparedStatement ps = con.prepareStatement("update register set phone=? where email=?");
        ps.setString(1, phone1);
        ps.setString(2, email1);

        ps.executeUpdate();
        con.close();
    }
}
