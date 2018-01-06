package tw.org.iii.myjava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Brad42 {

	public static void main(String[] args) {
		try {
//			FileInputStream fin = new FileInputStream("dir1/file2.txt");
//			InputStreamReader ir = new InputStreamReader(fin);
			
			FileReader fr = new FileReader("dir1/member.csv");
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			while ( (line = br.readLine()) != null) {
				
				String[] fields = line.split(",");
				System.out.println(fields[2]);
				
				
			}
			
			
			fr.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
