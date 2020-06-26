package practice.file;

import java.io.File;
import java.io.IOException;

public class TestFIleDirectory {

	public static void main(String[] args) {

	/*	File f = new File("test123");
		System.out.println(f.exists());   // this code creates directory
		f.mkdir();
		System.out.println(f.exists()); */
		
		
		File f = new File("D:\\java\\subjava");
		f.mkdir();
		//File f1 = new File("D:\\java\\subjava","abc.txt");
		File f1 = new File(f,"demo.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// directory is cretated earlier
		
//		File f = new File("D:\\java","demo.txt");
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
