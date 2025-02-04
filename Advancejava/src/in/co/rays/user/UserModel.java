package in.co.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.marksheet.MarksheetBean;

public class UserModel {
	
	public Integer nextPk() throws Exception {

	int pk = 0;

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

	PreparedStatement ps = conn.prepareStatement("select max(id) from user");

	ResultSet rs = ps.executeQuery();

	while (rs.next()) {
		pk = rs.getInt(1);
	}
	return pk + 1;
}

public void add(UserBean bean) throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

	PreparedStatement ps = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?, ?)");

	ps.setInt(1, nextPk());
	ps.setString(2, bean.getFirst_name());
	ps.setString(3, bean.getLast_name());
	ps.setString(4, bean.getLogin_id());
	ps.setString(5, bean.getPassword());
	ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
	ps.setString(7, bean.getAddress());

	int i = ps.executeUpdate();

	System.out.println("Data inserted = " + i);

}

public void update(UserBean bean) throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

	PreparedStatement ps = conn.prepareStatement(
			"update user set first_name = ?, last_name = ?, login_id = ?, password = ?, dob = ?, address = ? where id = ?");

	ps.setString(1, bean.getFirst_name());
	ps.setString(2, bean.getLast_name());
	ps.setString(3, bean.getLogin_id());
	ps.setString(4, bean.getPassword());
	ps.setDate(5, new java.sql.Date(bean.getDob().getTime()));
	ps.setString(6, bean.getAddress());
	ps.setInt(7, bean.getId());

	int i = ps.executeUpdate();

	System.out.println("Data updated = " + i);

}

public void delete(int id) throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

	PreparedStatement ps = conn.prepareStatement("delete from user where id = ?");

	ps.setInt(1, id);

	int i = ps.executeUpdate();

	System.out.println("Data deleted = " + i);

}

public UserBean findByPk(int pk) throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

	PreparedStatement ps = conn.prepareStatement("select * from user where id = ?");

	ps.setInt(1, pk);

	ResultSet rs = ps.executeQuery();

	UserBean bean = null;

	while (rs.next()) {
		bean = new UserBean();
		bean.setId(rs.getInt(1));
		bean.setFirst_name(rs.getString(2));
		bean.setLast_name(rs.getString(3));
		bean.setLogin_id(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setDob(rs.getDate(6));
		bean.setAddress(rs.getString(7));
	}
	return bean;

}

public UserBean authenticate(String loginId, String password) throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

	PreparedStatement ps = conn.prepareStatement("select * from user where login_id = ? and password = ?");

	ps.setString(1, loginId);
	ps.setString(2, password);

	ResultSet rs = ps.executeQuery();

	UserBean bean = null;

	while (rs.next()) {
		bean = new UserBean();
		bean.setId(rs.getInt(1));
		bean.setFirst_name(rs.getString(2));
		bean.setLast_name(rs.getString(3));
		bean.setLogin_id(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setDob(rs.getDate(6));
		bean.setAddress(rs.getString(7));
	}
	return bean;

}

public List search(UserBean bean) throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

	StringBuffer sql = new StringBuffer("select * from user where 1=1");

	if (bean != null) {

		if (bean.getDob() != null && bean.getDob().getTime() > 0) {

			sql.append(" and dob like '" + new java.sql.Date(bean.getDob().getTime()) + "%'");

		}

	}

	System.out.println("SQL ====>>> " + sql);

	PreparedStatement ps = conn.prepareStatement(sql.toString());

	ResultSet rs = ps.executeQuery();

	List list = new ArrayList();

	while (rs.next()) {
		bean = new UserBean();
		bean.setId(rs.getInt(1));
		bean.setFirst_name(rs.getString(2));
		bean.setLast_name(rs.getString(3));
		bean.setLogin_id(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setDob(rs.getDate(6));
		bean.setAddress(rs.getString(7));
		list.add(bean);
	}
	return list;

}


	

}