package tw.org.iii.myjava;

import java.util.Arrays;

public class PokerV2 {

	public static void main(String[] args) {
		//long start = System.currentTimeMillis();
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=poker.length; i>0; i--) {	// i = 52 ... 1
			int rand = (int)(Math.random()*i);	// rand = 0 ... 51
			// 交換 => last => i-1
			int temp = poker[rand];
			poker[rand] = poker[i-1];
			poker[i-1] = temp;
//			System.out.println(
//				"rand="+rand + "; poker[rand]="+poker[rand]+";poker[last]="+poker[i-1]);
		}
		//for (int v : poker) System.out.println(v);
		//System.out.println("---");
		//System.out.println(System.currentTimeMillis()-start);
		
		// 四個玩家, 各家13張牌
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ",
							"10","J ","Q ","K "};
		for (int[] player : players) {
			Arrays.sort(player);
			for (int card : player) {
				System.out.print(suits[card/13] + values[card%13] +" ");
			}
			System.out.println();
		}
		
		
		
	}

}
