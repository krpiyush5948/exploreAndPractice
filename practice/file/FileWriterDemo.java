package practice.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\java\\subjava\\fileWriter.txt",true);
		fw.write(100);
		fw.write("urga\ntricon infotech");
		fw.write('\n');
		char [] ch = {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
	}
}
