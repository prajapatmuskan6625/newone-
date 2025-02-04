package in.com.advace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Testadd{
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("insert into marksheet values(6, 'aviansh', 185, 152, 70, 69)");

		System.out.println("Data Inserted = " + i);
	}

}
