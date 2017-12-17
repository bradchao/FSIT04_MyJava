package tw.org.iii.myjava;

public class Brad13 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		int n = 74;
		// 1 + 2 + 3 + ... + n = ?
		while (i<=n) {
			sum += i++; 
		}
		System.out.println("1 + 2 + ... + " + n + " = " + sum);

	}

}
