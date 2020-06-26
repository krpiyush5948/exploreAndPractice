package practice.file;
import java.io.*;
public class TestFile {

	public static void main(String[] args) {
		
		File f = new File("abcd.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
	}
}
