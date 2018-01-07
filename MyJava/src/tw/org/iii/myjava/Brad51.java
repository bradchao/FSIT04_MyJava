package tw.org.iii.myjava;

import java.util.LinkedList;

public class Brad51 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0,1);
		list.add(0,2);
		list.add(0,3);
		list.add(0,4);
		list.add(0,5);
		System.out.println(list.size());
		System.out.println(list);
		
		for (Integer obj : list) {
			System.out.println(obj);
		}
		System.out.println("---");
		System.out.println(list.get(2));
		
		
	}

}
