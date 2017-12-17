package tw.org.iii.myjava;

public class PokerV3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//  1. 洗牌
		int[] poker = new int[52];
		boolean isRepeat; int rand;
		for (int i=0; i<poker.length; i++) {
			do {
				rand = (int)(Math.random()*52);
				
				// 檢查機制
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == rand) {
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);
			
			poker[i] = rand;
			System.out.println(rand);
		}
		System.out.println("---");
		System.out.println(System.currentTimeMillis()-start);
		
		// 2. 發牌
		
		// 3. 攤牌 + 理牌
	}

}
