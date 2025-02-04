package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransactionHandling {
	
	

		public static void main(String[] args) throws Exception {

			Connection conn = null;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

				conn.setAutoCommit(false);

				Statement stmt = conn.createStatement();

				int i = stmt.executeUpdate("insert into emp values(8, 'abc', 1000)");
				i = stmt.executeUpdate("insert into emp values(9, 'abc', 1000)");
				i = stmt.executeUpdate("insert into emp values(10., 'abc', 1000)");

				conn.commit();

				System.out.println("Data Inserted = " + i);
			} catch (Exception e) {
				conn.rollback();
			}

		}

	}




