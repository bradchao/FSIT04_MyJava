package tw.org.iii.myjava;

public class Brad17 {

	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = "Brad";
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s3.equals(s1));
		System.out.println(s1);
		System.out.println(s3);
		
		int a = 10, b =10;
		System.out.println(a == b);
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1 == b2);
		System.out.println(b1);	
		System.out.println(b2);
		
		
		
	}

}
