package tw.org.iii.myjava;

public class Brad31 {

	public static void main(String[] args) {
		try {
			int a = 10, b = 3;
			int c = a / b;
			int[] d = {1,2,3,4};
			System.out.println(d[4]);
		}catch(IndexOutOfBoundsException e2) {
			System.out.println("Exception");
		}catch(ArithmeticException e2) {
			System.out.println("Exception");
		}catch(RuntimeException e2) {
			System.out.println("Exception");
		}
		System.out.println("End");
	}

}
