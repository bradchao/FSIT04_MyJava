package tw.org.iii.myjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad37 {

	public static void main(String[] args) {
		File file2 = new File("dir1/file2.txt");
		try {
			FileOutputStream fout = 
					new FileOutputStream(file2, true);
			fout.write("Hello, III\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
