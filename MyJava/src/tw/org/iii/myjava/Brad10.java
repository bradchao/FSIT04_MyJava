package tw.org.iii.myjava;

public class Brad10 {

	public static void main(String[] args) {
		int[] p = new int[6];	// [0]:0; [1]:0; ....[5]:0
		
		for (int i=0; i<100; i++) {
			int rand = (int)(Math.random()*6);
			p[rand]++;
		}
		
		for (int i=0; i<p.length; i++) {
			System.out.println((i+1) + "點出現" + p[i] + "次");
		}
		
	}

}
