package tw.org.iii.myjava;

public class Brad19 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		System.out.println(score);
		Brad191.sayYa();
		Brad191.sayHello("Brad");
		System.out.println(Brad192.fx(3));
		System.out.println(Brad192.fxy(3,4));
		System.out.println(Brad191.a);
		System.out.println("---");
		System.out.println(Bike.count);
		Bike b1 = new Bike();
		Bike b2 = new Bike(2);
		System.out.println(Bike.count);
		System.out.println(b1.count);
		
		
	}

}
class Brad191 {
	static int a;
	static void sayYa() {
		System.out.println("Ya");
	}
	static void sayHello(String name) {
		System.out.println("Hello, " +name);
	}
	static void m1() {
		System.out.println("m1()" +a);
	}
}
class Brad192 {
	static int fx(int x) {
		return 2*x + 1;
	}
	static int fxy(int x, int y) {
		return 2*x + y;
	}
	
	
	
}
