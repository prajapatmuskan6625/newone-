package in.co.rays.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecord {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		PreparedStatement ps = conn.prepareStatement("update sudent set firstname = 'jay'");

		int i = ps.executeUpdate();
		
		System.out.println("update data = " + i);
	}

}
