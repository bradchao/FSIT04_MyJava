package tw.org.iii.myjava;

public class Brad02 {

	public static void main(String[] args) {
		byte a = 10;
		short b = 3;
		int c = a / b;	// byte, short, int , char => int
		System.out.println(a / b);
		
		char c1 = 123;
		
		long d = 12;
		long e = c + d;	// byte, short, int , char, long => long
		
		System.out.println("1. " + ++a);
		System.out.println("2. " +a);
		System.out.println("--------");
		
		double var1 = 10;
		double var2 = 0;
		System.out.println(var1 / var2);
		
		System.out.println( 10 % 4);
		
		
		
	}

}
