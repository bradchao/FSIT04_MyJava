package tw.org.iii.myjava;

public class Brad27 {
	public static void main(String[] args) {

	}
}
interface Shape {
	double calLength();
	double calArea();
}
interface OCJP {
	void exam1();
	void exam2();
}
interface Rectangle extends Shape, OCJP {
	boolean isSquare();
}