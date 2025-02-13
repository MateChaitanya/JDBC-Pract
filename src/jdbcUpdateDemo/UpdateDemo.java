package jdbcUpdateDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Chaitu@123");

        PreparedStatement ps = con.prepareStatement("update register set phone='7972763580' where email='jailin@example.com'");
        ps.executeUpdate();

        con.close();
    }
}
