package tw.org.iii.myjava;

import java.util.HashSet;

public class Brad50 {

	public static void main(String[] args) {
		HashSet lottery = new HashSet();
		System.out.println(lottery.size());
		while (lottery.size()<6) {
			lottery.add((int)(Math.random()*49)+1);
		}
		System.out.println(lottery);
	}

}
