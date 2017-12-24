package tw.org.iii.myjava;

import java.util.prefs.InvalidPreferencesFormatException;

public class Brad32 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(2);
		}catch(Exception e) {
			
		}
	}

}
class Bird {
	private int leg;
	void setLeg(int n) throws Exception {
		if (n>=0 && n<=2) {
			leg = n;
		}else {
			throw new InvalidPreferencesFormatException("ee");
			//throw new Exception();
		}
	}
}
