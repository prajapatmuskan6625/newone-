package in.co.rays.marksheet;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import in.co.rays.util.JDBCDataSource;

public class MarksheetModel {
	
//		public static void add(MarksheetBean bean) throws Exception {
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?, ?, ?, ?, ?, ?)");
//
//			ps.setInt(1, bean.getId());
//			ps.setString(2, bean.getName());
//			ps.setInt(3, bean.getRoolno());
//			ps.setInt(4, bean.getPhysics());
//			ps.setInt(5, bean.getChemistry());
//			ps.setInt(6, bean.getMaths());
//
//			int i = ps.executeUpdate();
//
//			System.out.println("Data inserted = " + i);
//
//		}
//
//		public void update(MarksheetBean bean) throws Exception {
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement(
//					"update marksheet set name = ?, roll_no = ?, physics = ?, chemistry = ?, maths = ? where id = ?");
//
//			ps.setString(1, bean.getName());
//			ps.setInt(2, bean.getRoolno());
//			ps.setInt(3, bean.getPhysics());
//			ps.setInt(4, bean.getChemistry());
//			ps.setInt(5, bean.getMaths());
//			ps.setInt(6, bean.getId());
//
//			int i = ps.executeUpdate();
//
//			System.out.println("Data inserted = " + i);
//
//		}
//
//		public  void delete(int id) throws Exception {
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");
//
//			ps.setInt(1, id);
//
//			int i = ps.executeUpdate();
//
//			System.out.println("Data inserted = " + i);
//
//		}
//
//		
//			
//		}
//			
//			
	
	
	
	
	
//	
//
//
//		public Integer nextPk() throws Exception {
//
//			int pk = 0;
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet");
//
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				pk = rs.getInt(1);
//			}
//			return pk + 1;
//		}
//
//		public void add(MarksheetBean bean) throws Exception {
//
//			int pk = nextPk();
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?, ?, ?, ?, ?, ?)");
//
//			ps.setInt(1, pk);
//			ps.setString(2, bean.getName());
//			ps.setInt(3, bean.getRoolno());
//			ps.setInt(4, bean.getPhysics());
//			ps.setInt(5, bean.getChemistry());
//			ps.setInt(6, bean.getMaths());
//
//			int i = ps.executeUpdate();
//
//			System.out.println("Data inserted = " + i);
//
//		}
//
//		public void update(MarksheetBean bean) throws Exception {
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement(
//					"update marksheet set name = ?, roll_no = ?, physics = ?, chemistry = ?, maths = ? where id = ?");
//
//			ps.setString(1, bean.getName());
//			ps.setInt(2, bean.getRoolno());
//			ps.setInt(3, bean.getPhysics());
//			ps.setInt(4, bean.getChemistry());
//			ps.setInt(5, bean.getMaths());
//			ps.setInt(6, bean.getId());
//
//			int i = ps.executeUpdate();
//
//			System.out.println("Data inserted = " + i);
//
//		}
//
//		public void delete(int id) throws Exception {
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");
//
//			ps.setInt(1, id);
//
//			int i = ps.executeUpdate();
//
//			System.out.println("Data inserted = " + i);
//
//		}
//
//		public MarksheetBean findByPk(int id) throws Exception {
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = ?");
//
//			ps.setInt(1, id);
//
//			ResultSet rs = ps.executeQuery();
//
//			MarksheetBean bean = null;
//
//			while (rs.next()) {
//				bean = new MarksheetBean();
//				bean.setId(rs.getInt(1));
//				bean.setName(rs.getString(2));
//				bean.setRoolno(rs.getInt(3));
//				bean.setPhysics(rs.getInt(4));
//				bean.setChemistry(rs.getInt(5));
//				bean.setMaths(rs.getInt(6));
//			}
//			return bean;
//		}
//
//		public List search() throws Exception {
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//			PreparedStatement ps = conn.prepareStatement("select * from marksheet");
//
//			ResultSet rs = ps.executeQuery();
//
//			List list = new ArrayList();
//
//			while (rs.next()) {
//				MarksheetBean bean = new MarksheetBean();
//				bean.setId(rs.getInt(1));
//				bean.setName(rs.getString(2));
//				bean.setRoolno(rs.getInt(3));
//				bean.setPhysics(rs.getInt(4));
//				bean.setChemistry(rs.getInt(5));
//				bean.setMaths(rs.getInt(6));
//				list.add(bean);
//			}
//			return list;
//		}

	
	
	
	
	
	
	
	
	
	
	
	public Integer nextPk() throws Exception {

		int pk = 0;

		
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			pk = rs.getInt(1);
		}
		return pk + 1;
	}



	public void add(MarksheetBean bean) throws Exception {

		int pk = nextPk();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?, ?, ?, ?, ?, ?)");

		ps.setInt(1, pk);
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRoolno());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());

		int i = ps.executeUpdate();

		System.out.println("Data inserted = " + i);

	}

	public void update(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		PreparedStatement ps = conn.prepareStatement(
				"update marksheet set name = ?, roll_no = ?, physics = ?, chemistry = ?, maths = ? where id = ?");

		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getRoolno());
		ps.setInt(3, bean.getPhysics());
		ps.setInt(4, bean.getChemistry());
		ps.setInt(5, bean.getMaths());
		ps.setInt(6, bean.getId());

		int i = ps.executeUpdate();

		System.out.println("Data inserted = " + i);

	}

	public void delete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");

		ps.setInt(1, id);

		int i = ps.executeUpdate();

		System.out.println("Data inserted = " + i);

	}

	public MarksheetBean findByPk(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = ?");

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		MarksheetBean bean = null;

		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoolno(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
		}
		return bean;
	}

	public MarksheetBean findByRollNo(int rollNo) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet where roll_no = ?");

		ps.setInt(1, rollNo);

		ResultSet rs = ps.executeQuery();

		MarksheetBean bean = null;

		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoolno(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
		}
		return bean;
	}

	public List search(MarksheetBean bean, int pageNo, int pageSize) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		StringBuffer sql = new StringBuffer("select * from marksheet where 1=1");

		if (bean != null) {
			if (bean.getName() != null && bean.getName().length() > 0) {
				sql.append(" and name like '" + bean.getName() + "%'");
			}

			if (bean.getRoolno() > 0) {
				sql.append(" and roll_no = " + bean.getRoolno());
			}
		}

		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + ", " + pageSize);
		}

		System.out.println("SQL ====>>> " + sql);

		PreparedStatement ps = conn.prepareStatement(sql.toString());

		ResultSet rs = ps.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoolno(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			list.add(bean);
		}
		return list;
	}

	
	
	}


