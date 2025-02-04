package in.co.rays.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Testadd {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(12, 'Harsh', 111, 99, 92, 93)");

		int i = ps.executeUpdate();

		System.out.println("Data inserted = " + i);
	}

}
