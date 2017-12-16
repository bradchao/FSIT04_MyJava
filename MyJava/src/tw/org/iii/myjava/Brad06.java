package tw.org.iii.myjava;

public class Brad06 {

	public static void main(String[] args) {
		// switch
		byte a = 13;
		final byte b = 8;
		
		switch (a) {	// byte, short, int, char, String, enum
		case 1:
			System.out.println("A");
			break;
		default:
			System.out.println("X");
			//break;
		case 10:
			System.out.println("B1");
			//break;
		case b+3:
			System.out.println("B2");
			break;
		case 100:
			System.out.println("C");
			break;
		}
		System.out.println("here");
		
	}

}
