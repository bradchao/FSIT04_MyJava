package tw.org.iii.myjava;

public class Brad20 {

	public static void main(String[] args) {
		TWId myid = new TWId();
		System.out.println(myid.getId());
		System.out.println(TWId.isRightTWId(myid.getId()));
		
		
	}

}
