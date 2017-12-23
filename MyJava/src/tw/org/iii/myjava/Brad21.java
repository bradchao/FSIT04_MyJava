package tw.org.iii.myjava;

public class Brad21 {
	public static void main(String[] args) {
		System.out.println(Brad211.b);
//		Brad211 obj1 = new Brad211();
//		Brad211 obj2 = new Brad211();
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
