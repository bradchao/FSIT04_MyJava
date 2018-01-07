package tw.org.iii.myjava;

public class Brad49 {

	public static void main(String[] args) {
		Integer i1 = new Integer(123);
		Integer i2 = new Integer("123");
		Integer i3 = 123;	// auto-boxing
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = i1;	// auto-unboxing
		System.out.println(i4);
		
		byte b5 = 123;
		int i6 = b5;
		//Integer i7 = b5;
		
		Integer i7 = new Integer(127);
		Integer i8 = new Integer(127);
		System.out.println( i7 == i8);
		
		
		
		
	}

}
