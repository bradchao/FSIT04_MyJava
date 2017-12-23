package tw.org.iii.myjava;

public class Brad20 {

	public static void main(String[] args) {
		TWId myid = new TWId();
		System.out.println(myid.getId());
		System.out.println(TWId.isRightTWId(myid.getId()));
		
		TWId urid = TWId.createTWId("A123456787");
		if (urid != null) {
			System.out.println(urid.getId());
		}else {
			System.out.println("xx");
		}
		
		//TWId hisid = new TWId("A123456789");
		
		
	}

}
