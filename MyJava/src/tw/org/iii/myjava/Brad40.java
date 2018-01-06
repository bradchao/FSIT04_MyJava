package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad40 {

	public static void main(String[] args) {
		File sourceFile = new File("dir1/coffee.png");
		File targetFile = new File("dir2/coffee2.png");
		try {
			FileInputStream fin = new FileInputStream(sourceFile);
			
			FileOutputStream fout = new FileOutputStream(targetFile);
			int len; byte[] buf = new byte[1024*1024];
			while ( (len = fin.read(buf)) != -1) {
				fout.write(buf,0,len);
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
