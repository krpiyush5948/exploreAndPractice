package practice.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] arg) throws IOException {
		
		FileReader fr = new FileReader("D:\\java\\subjava\\fileWriter.txt");
		  int i = fr.read();
		  
		  while(i!=-1) {
			  
			  System.out.print((char) i);
			  i= fr.read();
		  }
		
	}
}
