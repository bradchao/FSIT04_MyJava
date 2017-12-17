package tw.org.iii.myjava;

import javax.swing.JOptionPane;

public class GuessNumber {

	public static void main(String[] args) {
		// 1. Create a Answer
		String answer = createAnswer(3); 
		//System.out.println(answer);
		
		// 2. start => 10 times
		boolean isWinner = false;
		for (int i=0; i<10; i++) {
			String guess = JOptionPane.showInputDialog("輸入數字");
			
			if (isRightInput(guess)) {
				String result = checkAB(answer, guess);
				JOptionPane.showMessageDialog(null, result);
				if (result.equals("3A0B")) {
					isWinner = true;
					break;
				}
			}
		}
		
		if (isWinner) {
			JOptionPane.showMessageDialog(null, "Winner");
		}else {
			JOptionPane.showMessageDialog(null, "Loser:" +answer);
		}
		
		
	}
	
	static boolean isRightInput(String g) {
		
		return true;
	}
	
	static String checkAB(String a, String g) {
		int A, B; A = B = 0;
		
		for (int i=0 ;i<a.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			}else if (a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		
		return A + "A" + B +"B";
	}
	
	static String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=poker.length; i>0; i--) {	
			int rand = (int)(Math.random()*i);	
			int temp = poker[rand];
			poker[rand] = poker[i-1];
			poker[i-1] = temp;
		}
		
		String ret = "";
		for (int i=0; i<d; i++) {
			ret += poker[i];
		}
		
		return ret;
	}

}
