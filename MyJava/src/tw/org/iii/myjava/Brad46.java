package tw.org.iii.myjava;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Brad46 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/s1.dat"));
			Object obj1 = oin.readObject();
			Student s1 = (Student)obj1;
			System.out.println(s1.calSum());
			System.out.println(s1.calAvg());
			oin.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.toString());
//		}catch (IOException e1) {
//			
//		}catch (ClassNotFoundException e1) {
//			
//		}catch (Exception e) {
//			
		}
		
	}

}
