package tw.org.iii.myjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad36 {

	public static void main(String[] args) {
		File file1 = new File("dir1/file1.txt");
		try {
			FileReader reader = new FileReader(file1);
			
			int c;
			while ( (c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
