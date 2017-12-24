package tw.org.iii.myjava;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class Brad33 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		File file = new File("dir2");
		System.out.println(file.exists());
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
		System.out.println("====");
		File dir3 = new File("dir3/dir4/dir5/dir6");
		if (dir3.exists()) {
			System.out.println("dir6 is exist");
		}else {
			if (dir3.mkdirs()) {
				System.out.println("mkdir success");
			}else {
				System.out.println("mkdir failure");
			}
		}
		System.out.println("====");
		File file1 = new File(dir3, "file1");
		if (!file1.exists()) {
			try {
				file1.createNewFile();
				System.out.println("OK");
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("----");
		if (dir3.isDirectory()) {
			File[] content = dir3.listFiles();
			for (File c : content) {
				System.out.println(c.getAbsolutePath());
			}
		}
		System.out.println("----");
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(dir3.lastModified());
		System.out.println(cal.get(Calendar.YEAR) + "/" +
				cal.get(Calendar.MONTH) + "/" +
				cal.get(Calendar.DAY_OF_MONTH));
		
		
		
		
	}

}
