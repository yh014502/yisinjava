package tw.org.iii.java;

import javax.swing.JOptionPane;

public class java28猜數字 {

	public static void main(String[] args) {
		// 1.產生答案
		String answer = creatAnswer(3);
		System.out.println(answer);
		// 2.開始遊戲
		boolean isWinner = false;
		for (int i = 0; i < 3; i++) {
			// 3.猜數字
			String guess = JOptionPane.showInputDialog("input number");
			// 4.回覆答案?a?b
			if (guess.equals(answer)) {
				isWinner = true;
				break;
			}
			String result = checkAB(answer, guess);
			JOptionPane.showMessageDialog(null, guess + ":" + result);
		}
		// 5.贏OR輸
		if (isWinner) {
			JOptionPane.showMessageDialog(null, "恭喜老爺");
		} else {
			JOptionPane.showMessageDialog(null, "魯蛇一條：" + answer);
		}
	}

	static String creatAnswer(int n) {
		int[] poker = new int[n];
		for (int i = 0; i < poker.length; i++) {
			int temp;

			// 檢查機制(是否重複)
			boolean isRepeat;
			do {
				temp = (int) (Math.random() * 10);
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
		String ret = "";
		for (int v : poker) {
			ret += v;
		}
		return ret;
	}

	static String checkAB(String a, String g) {
		int A, B;
		A = B = 0;
		for (int i = 0; i < g.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			} else if (a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return A + "A" + B + "B";
	}

}
