package tw.org.iii.myjava;

public class Brad16 {

	public static void main(String[] args) {
		String s1 = new String();
		
		byte[] b1 = {97,98,99,100};
		String s2 = new String(b1);
		
		String s3 = new String(b1, 1, 2);
		String s4 = "Hello, World";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s2.charAt(2));
		System.out.println(s4.charAt(2));
		System.out.println("Brad".charAt(2));
		
		
	}

}
