package tw.org.iii.myjava;

public class Brad14 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		//b2.speed = 10;
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		
		
	}

}
