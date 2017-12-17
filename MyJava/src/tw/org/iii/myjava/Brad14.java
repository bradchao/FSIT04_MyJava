package tw.org.iii.myjava;

public class Brad14 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		b1.setGear(2);
		b1.upSpeed(3.11);
		b1.upSpeed(2.32);
		b1.upSpeed(3);
		b1.upSpeed(2.12);
		//b2.speed = 10;
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		
		
	}

}
