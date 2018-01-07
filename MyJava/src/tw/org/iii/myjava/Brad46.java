package tw.org.iii.myjava;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Brad46 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/student.dat"));
			Student s1 = (Student)oin.readObject();
			Student s2 = (Student)oin.readObject();
			Student s3 = (Student)oin.readObject();
			System.out.println(s1.name);
			System.out.println(s2.name);
			System.out.println(s3.name);
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
