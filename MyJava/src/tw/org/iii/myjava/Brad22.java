package tw.org.iii.myjava;

public class Brad22 {
	public static void main(String[] args) {
		Brad222 obj1 = new Brad222();
		Brad223 obj2 = new Brad223();
		
		doM1(obj1);
		doM1(obj2);
		
	}
	
	static void doM1(Brad221 obj) {
		obj.m1();
	}
	
}
class Brad221 {
	void m1() {System.out.println("Brad221:m1()");}
}
class Brad222 extends Brad221 {
	@Override
	void m1() {
		super.m1();
		System.out.println("Brad222:m1()");
	}
	void m2() {
		System.out.println("Brad222:m2()");
	}
}

class Brad223 extends Brad221 {
	int m2() {
		System.out.println("Brad223:m2()");
		return 21;
	}
	Object m3() {
		return "";
	}
}
class Brad224 extends Brad223 {
	public int m2(){
		return 1;
	}
	String m3(){
		return "";
	}
}


