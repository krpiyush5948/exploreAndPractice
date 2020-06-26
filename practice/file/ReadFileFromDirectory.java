package practice.file;

import java.io.File;

public class ReadFileFromDirectory {

	public static void main(String[] args) {
		
		int count =0;
		
		File f = new File("D:\\java\\subjava");
		
		String [] listOfFile = f.list();
		for(String file:listOfFile) {
			count++;
			
			System.out.println(file);
			
		}
		System.out.println(count);
	}
}
