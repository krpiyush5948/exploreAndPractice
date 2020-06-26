package practice.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\java\\subjava\\fileWriter.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int) f.length()]; // character range is int range and length return type is lomg
		fr.read(ch);
		for (char c : ch) {
			System.out.print(c);
		}

		System.out.println("\n***************************************");

		FileReader fr1 = new FileReader("D:\\java\\subjava\\fileWriter.txt");
		int i = fr1.read();

		while (i != -1) {

			System.out.print((char) i);
			i = fr1.read();
		}
	}
}
