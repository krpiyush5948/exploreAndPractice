package practice.program;

import java.io.*;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a =10;
//		System.out.println(a);
//		
//		float f = a;
//		System.out.println(f);
//		
//		float l= 45.9f;
//		int p = (int) l;
//		System.out.println(p);
//		
		try {
			PrintWriter pw = new PrintWriter("abc.txt");
			pw.print("hello to my system");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
