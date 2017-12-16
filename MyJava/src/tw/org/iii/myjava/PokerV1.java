package tw.org.iii.myjava;

public class PokerV1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//  1. 洗牌
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) {
			int rand = (int)(Math.random()*52);
			
			// 檢查機制
			boolean isRepeat = false;
			for (int j=0; j<i; j++) {
				if (poker[j] == rand) {
					isRepeat = true;
					break;
				}
			}
			
			if (!isRepeat) {
				poker[i] = rand;
				System.out.println(rand);
			}else {
				i--;
			}
		}
		System.out.println("---");
		System.out.println(System.currentTimeMillis()-start);
		
		// 2. 發牌
		
		// 3. 攤牌 + 理牌
	}

}
