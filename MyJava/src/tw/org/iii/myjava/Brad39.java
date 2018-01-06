package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad39 {

	public static void main(String[] args) {
		File sourceFile = new File("dir1/coffee.png");
		File targetFile = new File("dir2/coffee.png");
		try {
			FileInputStream fin = new FileInputStream(sourceFile);
			
			FileOutputStream fout = new FileOutputStream(targetFile);
			int b;
			while ( (b = fin.read()) != -1) {
				fout.write(b);
			}
			fout.flush();
			fout.close();
			
			fin.close();
			System.out.println("finish");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
				
		
		
		
	}

}
