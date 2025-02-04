package in.co.rays.Testbundle;

import java.util.ResourceBundle;

public class TestSourceBundle {
	
   public static void main(String[] args) {
	   
	   ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.app_hi");
	   System.out.println(rs.getString("aditya"));
	
}

}
