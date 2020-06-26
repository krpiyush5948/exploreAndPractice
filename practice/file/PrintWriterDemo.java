package practice.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("D:\\java\\subjava\\printWriter.txt");
		pw.write(100);
		pw.println(100);
		pw.println("Piyush Kumar");
		pw.println(true);
		pw.println('c');
		
		pw.flush();
		pw.close();
	}
}
