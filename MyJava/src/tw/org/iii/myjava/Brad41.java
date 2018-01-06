package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad41 {

	public static void main(String[] args) {
		File sourceFile = new File("dir1/coffee.png");
		File targetFile = new File("dir2/coffee3.png");

		try {
			FileInputStream fin = new FileInputStream(sourceFile);
			byte[] buf = new byte[(int)sourceFile.length()];
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(targetFile);
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("Copy Success");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
