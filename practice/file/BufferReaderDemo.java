package practice.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("D:\\java\\subjava\\bufferWriter.txt");
		BufferedReader br = new BufferedReader(fr);
		String line =br.readLine();
		while(line!= null) {
			System.out.print(line);
		line= br.readLine();
		}
		br.close();
		
	}

}
