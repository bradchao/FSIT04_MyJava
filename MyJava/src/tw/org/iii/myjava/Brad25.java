package tw.org.iii.myjava;

public class Brad25 {
	public static void main(String[] args) {
		Brad251 obj1 = new Brad252();
		Brad251 obj2 = new Brad253();
		obj1.m2();
		obj2.m2();
	}
}
abstract class Brad251 {
	void m1() {System.out.println("Brad251:m1()");}
	abstract void m2();
}
class Brad252 extends Brad251 {
	void m2() {System.out.println("Brad252:m2()");}
}
class Brad253 extends Brad251 {
	void m2() {System.out.println("Brad253:m2()");}
}
