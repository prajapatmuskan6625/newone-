package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Testadd {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		
		Statement st =con.createStatement ();
		
		int i = st.executeUpdate("insert into dept values(5,'lalu')");
		
		 System.out.println("insert data"+i);
		
	}

}
