package tw.org.iii.myjava;

import java.io.File;

public class Brad38 {

	public static void main(String[] args) {
		File file1 = new File("dir2/file1.txt");
		File file11 = new File("dir2/file2.txt");
		if (file1.renameTo(file11)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		
	}

}
