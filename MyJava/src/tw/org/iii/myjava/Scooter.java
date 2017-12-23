package tw.org.iii.myjava;

public class Scooter extends Bike{
	public Scooter(int a) {
		// super();	==> 呼叫父類別的建構式 => 建立一個父類別的物件實體
		System.out.println("Scooter(int)");
	}
	public Scooter(double a) {
		System.out.println("Scooter(double)");
	}
}
class ScooterV2 extends Scooter {
	ScooterV2(){
		// super(); => where?
		super(3.0);
		System.out.println("ScooterV2()");
	}
	
	ScooterV2(int a){
		this();
		System.out.println("ScooterV2(int)");
	}
	
	
	
}