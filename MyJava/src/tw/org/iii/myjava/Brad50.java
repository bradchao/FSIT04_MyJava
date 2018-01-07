package tw.org.iii.myjava;

import java.util.Iterator;
import java.util.TreeSet;

public class Brad50 {

	public static void main(String[] args) {
		TreeSet<Integer> lottery = new TreeSet<>();
		System.out.println(lottery.size());
		while (lottery.size()<6) {
			lottery.add((int)(Math.random()*49)+1);
		}
		System.out.println(lottery);
		
		Iterator<Integer> it = lottery.iterator();
		while (it.hasNext()) {
			Integer obj = it.next();
			System.out.println(obj);
		}
		System.out.println("-------");
		for (Integer i : lottery) {
			System.out.println(i);
		}
		
	}

}
