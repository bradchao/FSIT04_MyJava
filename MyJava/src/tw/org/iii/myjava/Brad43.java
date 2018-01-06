package tw.org.iii.myjava;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad43 {

	public static void main(String[] args) {
		try {
			DataOutputStream dout = 
					new DataOutputStream(
							new FileOutputStream("dir1/mydata.dat"));
			dout.writeInt(123);
			dout.writeBoolean(false);
			dout.writeDouble(12.3);
			dout.flush();
			dout.close();
			System.out.println("Save OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
