package tw.org.iii.myjava;

import java.util.HashSet;

public class Brad48 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");
		set.add(123);
		set.add(12.3);
		set.add("Brad");
		set.add(129);
		set.add(129);
		set.add(new Integer(129));
		set.add(new Integer(129));
		set.add(new Brad(1));
		set.add(new Brad(2));
		System.out.println(set.size());
		System.out.println(set);
	}
}
class Brad {
	int i;
	Brad(int i){this.i=i;}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		return true;
	}
}
