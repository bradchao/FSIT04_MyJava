package tw.org.iii.myjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad47 {
	public static void main(String[] args) {
		Brad473 obj1 = new Brad473();
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/obj1"));
			oout.writeObject(obj1);
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		System.out.println("-----");
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(new FileInputStream("dir1/obj1"));
			Object obj = oin.readObject();
			oin.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		
	}
}
class Brad471  implements Serializable {
	Brad471(){
		System.out.println("Brad471()");
	}
}
class Brad472 extends Brad471  {
	Brad472(){
		System.out.println("Brad472()");
	}
}
class Brad473 extends Brad472 {
	Brad473(){
		System.out.println("Brad473()");
	}
}
