package in.co.rays.marksheet2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Model {
	
		public Bean findByid(int id) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			String name = "root";
			String pass = "root";
			String url = "jdbc:mysql://localhost:3306/advance04";
			conn = DriverManager.getConnection(url,pass,name);
			
			PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			Bean bn = null;
			while(rs.next()) {
				bn = new Bean();
				bn.setId(rs.getInt(1));
				bn.setName(rs.getString(2));
				bn.setRoolno(rs.getInt(3));
				bn.setPhysics(rs.getInt(4));
				bn.setChemistry(rs.getInt(5));
				bn.setMaths(rs.getInt(6));
			}
			return bn;
		}
		public List search() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			String name = "root";
			String pass = "root";
			String url = "jdbc:mysql://localhost:3306/advance04";
			conn = DriverManager.getConnection(url,pass,name);
			
			PreparedStatement ps = conn.prepareStatement("select * from marksheet");
			ResultSet rs = ps.executeQuery();
			List list = new ArrayList();
			
			
			
			while(rs.next()) {
				Bean bn = new Bean();
				bn.setId(rs.getInt(1));
				bn.setName(rs.getString(2));
				bn.setRoolno(rs.getInt(3));
				bn.setPhysics(rs.getInt(4));
				bn.setChemistry(rs.getInt(5));
				bn.setMaths(rs.getInt(6));
				list.add(bn);
			}
			return list;
			
	}
		public Integer nextid() throws Exception {
			int pk =0;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			String name = "root";
			String pass = "root";
			String url = "jdbc:mysql://localhost:3306/advance04";
			conn = DriverManager.getConnection(url,pass,name);
			
			PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				pk = rs.getInt(1);
				
			}
			return pk+1;
			
	}


}
