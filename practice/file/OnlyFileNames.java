package practice.file;
import java.io.File;

// code to read only filenames from directory
public class OnlyFileNames {

public static void main(String[] args) {
		
		int count =0;
		
		File f = new File("D:\\java\\subjava");
		
		String [] listOfFile = f.list();
		for(String file:listOfFile) {
			File f1 = new File(f,file);
			System.out.println(f1.isFile());
			if(f1.isFile())
			{
			count++;
			System.out.println(file);
			}
			
		}
		System.out.println(count);
}
}
