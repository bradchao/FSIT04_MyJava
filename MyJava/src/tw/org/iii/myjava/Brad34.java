package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad34 {
	public static void main(String[] args) {
		File file1 = new File("dir1/file1.txt");
		if (file1.isFile() && file1.canRead()) {
			try {
				FileInputStream fin = 
						new FileInputStream(file1);
				int r = fin.read();
				System.out.println((char)r);
				fin.close();
//			} catch (FileNotFoundException e) {
//				
//			} catch (IOException e) {
//				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}else {
			System.out.println("X1");
		}
	}
}
