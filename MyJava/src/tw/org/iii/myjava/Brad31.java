package tw.org.iii.myjava;

public class Brad31 {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			int c = a / b;
			int[] d = {1,2,3,4};
			System.out.println(d[4]);
		}catch(ArrayIndexOutOfBoundsException ee) {
			System.out.println("E1");
		}catch(ArithmeticException e2) {
			System.out.println("E2");
		}
		System.out.println("End");
	}

}
