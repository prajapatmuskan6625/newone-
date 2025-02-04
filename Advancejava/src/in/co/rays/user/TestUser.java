package in.co.rays.user;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {

	public static void main(String[] args) throws Exception {

		 //testAdd();
		testSearch();
//		testUpdate();

	}

	

	private static void testSearch() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setDob(sdf.parse("2001-01-01"));

		UserModel model = new UserModel();

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirst_name());
			System.out.print("\t" + bean.getLast_name());
			System.out.print("\t" + bean.getLogin_id());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());

		}

	}

	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setId(2);
		bean.setFirst_name("raj");
		bean.setLast_name("kumar");
		mailto: bean.setLogin_id("raj@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("2001-01-01"));
		bean.setAddress("indore");

		UserModel model = new UserModel();

		model.add(bean);

	}

	private static void testUpdate() throws Exception {
		

}
}