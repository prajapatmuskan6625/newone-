package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {
	
		public static void main(String[] args)throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coching","root","root");
			
			Statement st = con.createStatement();
			
			int i = st.executeUpdate("update student set firstname ='jay' where id = 2");
			System.out.println("update record"+i);



		
			
		}
		}


