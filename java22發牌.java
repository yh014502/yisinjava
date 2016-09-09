package tw.org.iii.java;

import java.util.Arrays;

public class java22發牌 {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52];
		for (int i = 0; i < poker.length; i++) {
			int temp;

			// 檢查機制(是否重複)
			boolean isRepeat;
			do {
				temp = (int) (Math.random() * 52 );
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);
			poker[i] = temp;
		}

		// 發牌
		int[][] player = new int[4][13];
		for (int i = 0; i < poker.length; i++) {
			player[i % 4][i / 4] = poker[i]; // MOD4發給四位玩家，/4每位玩家發一張循環

		}
		// 查看發牌情況
		String[] suit = {"黑桃","紅心","方塊","梅花"};
		String[] value = {"A ","2 ","3 ","4 ","5 ","6 ","7 ",
							"8 ","9 ","10","J ","Q ","K "};
		for (int[] cards :player){
			Arrays.sort(cards);    //排序牌
			for (int card :cards){
				System.out.print(suit[card/13] + value[card%13] + " ");
			}
			System.out.println();
		}
		
		}
	}


