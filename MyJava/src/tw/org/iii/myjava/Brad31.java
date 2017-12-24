package tw.org.iii.myjava;

public class Brad31 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		System.out.println("1---");
		try {
			int c = a / b;
		}catch (ArithmeticException ae) {
			System.out.println("E1");
		}
		System.out.println("2---");
		int[] d = {1,2,3,4};
		System.out.println("3---");
		try {
			System.out.println(d[3]);
		}catch(ArrayIndexOutOfBoundsException ee) {
			System.out.println("E2");
		}
		System.out.println("4---");
	}

}
