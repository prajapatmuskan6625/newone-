package in.co.rays.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletedata {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		PreparedStatement ps = conn.prepareStatement(null);

		int i = ps.executeUpdate("delete from student where id = 2");
		
		System.out.println(" delete data = " + i);
	}
	

}
