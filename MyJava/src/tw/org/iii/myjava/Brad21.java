package tw.org.iii.myjava;

public class Brad21 {
	public static void main(String[] args) {
//		System.out.println(Brad211.b);
//		Brad211 obj1 = new Brad211();
//		Brad211 obj2 = new Brad211();
		
		Brad212 obj3 = new Brad212();
	}
}
class Brad211 {
	static int b;
	int a = 12;
	static {
		System.out.println("static{}");
	}
	{
		System.out.println("{}:a=" + a);
	}
	Brad211(){
		System.out.println("Brad211()");
	}
	void m1() {System.out.println("Brad211:m1()");}
}
class Brad212 extends Brad211 {
	static {System.out.println("Brad212:static{}");}
	Brad212(){System.out.println("Brad212()");}
}
