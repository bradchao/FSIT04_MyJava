package tw.org.iii.myjava;

public class Brad26 {

	public static void main(String[] args) {
		Brad261 obj1 = new Brad262();
		Brad261 obj2 = new Brad264();
		
		obj1.exam1();
	}

}
// 定義規格
interface Brad261 {
	void exam1();
	void exam2();
}
class Brad262 implements Brad261 {
	public void exam1() {}
	public void exam2() {}
}
interface Brad263 {
	void m3();
}
class Brad264 implements Brad261, Brad263 {
	public void exam1() {}
	public void exam2() {}
	public void m3() {}
}




