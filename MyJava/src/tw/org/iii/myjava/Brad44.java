package tw.org.iii.myjava;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad44 {

	public static void main(String[] args) {
		try {
			DataInputStream din = 
				new DataInputStream(
					new FileInputStream("dir1/mydata.dat"));
			int v1 = din.readInt();
			System.out.println(v1);
			boolean v2 = din.readBoolean();
			System.out.println(v2);
			double v3 = din.readDouble();
			System.out.println(v3);
			din.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
