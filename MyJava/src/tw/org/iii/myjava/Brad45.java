package tw.org.iii.myjava;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad45 {
	public static void main(String[] args) {
		Student s1 = new Student(90, 40, 30);
		System.out.println(s1.calSum());
		System.out.println(s1.calAvg());
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/s1.dat"));
			oout.writeObject(s1);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
class Student implements Serializable {
	int ch, eng, math;
	Student(int ch, int eng, int math){
		this.ch = ch; this.eng = eng; this.math = math;
	}
	int calSum() {
		return ch + eng + math;
	}
	double calAvg() {
		return calSum() / 3.0;
	}
}
