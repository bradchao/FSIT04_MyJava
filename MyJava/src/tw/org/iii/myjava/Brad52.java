package tw.org.iii.myjava;

import java.util.HashMap;
import java.util.Set;

public class Brad52 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("name", "Brad");
		map.put("w", 80);
		map.put("h", 195);
		//System.out.println(map.get("w"));
		Set keys = map.keySet();
		for(Object key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
