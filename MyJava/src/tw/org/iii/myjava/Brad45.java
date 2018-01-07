package tw.org.iii.myjava;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad45 {
	public static void main(String[] args) {
		Student s1 = new Student("Brad", 90, 40, 30);
		System.out.println(s1.calSum());
		System.out.println(s1.calAvg());
		Student s2 = new Student("Eric", 60, 50, 30);
		Student s3 = new Student("Andy", 70, 60, 20);
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/student.dat"));
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.writeObject(s3);
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
	String name;
	Box box;
	Student(String name, int ch, int eng, int math){
		this.name = name;
		this.ch = ch; this.eng = eng; this.math = math;
		box = new Box(0);
	}
	int calSum() {
		return ch + eng + math;
	}
	double calAvg() {
		return calSum() / 3.0;
	}
}
class Box implements Serializable {
	int counter;
	Box(int c){
		counter = c;
	}
}
