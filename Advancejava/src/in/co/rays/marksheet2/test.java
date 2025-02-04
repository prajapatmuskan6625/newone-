package in.co.rays.marksheet2;

import java.util.Iterator;
import java.util.List;

public class test {
	
		public static void main(String[] args) throws Exception  {
			//testbyid();
			testsearch();
			
			testbyid();
			
		}
	
			
		
		private static void testsearch() throws Exception {
			Model md = new Model();
			List list = md.search();
			Iterator it = list.iterator();
			while(it.hasNext()) {
				Bean bn = (Bean) it.next();
				System.out.print(bn.getId());
				System.out.print("\t"+bn.getName());
				System.out.print("\t"+bn.getRoolno());
				System.out.print("\t"+bn.getPhysics());
				System.out.print("\t"+bn.getChemistry());
				System.out.println("\t"+bn.getMaths());
			}
			
			
		}
		private static void testbyid() throws Exception {
			Model md = new Model();
			Bean bn = md.findByid(3);
			if (bn!=null)	{
				System.out.print(bn.getId());
				System.out.print("\t"+bn.getName());
				System.out.print("\t"+bn.getRoolno());
				System.out.print("\t"+bn.getPhysics());
				System.out.print("\t"+bn.getChemistry());
				System.out.println("\t"+bn.getMaths());
			}
			else {
				System.out.println("id dos not exist.....!!!");
			}
			
		}
	}



