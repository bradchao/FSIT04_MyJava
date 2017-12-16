package tw.org.iii.myjava;

public class Brad10 {

	public static void main(String[] args) {
		int[] p = new int[6];	// [0]:0; [1]:0; ....[5]:0
		
		for (int i=0; i<1000000; i++) {
			int rand = (int)(Math.random()*9);	// 0 , ... 8
			p[rand<=5?rand:rand-3]++;
		}
		
		for (int i=0; i<p.length; i++) {
			System.out.println((i+1) + "點出現" + p[i] + "次");
		}
		
		for (int v : p) {	// for-each
			System.out.println(v);
		}
		
		
	}

}
