package tw.org.iii.java;

public class java20擲骰子array {

	public static void main(String[] args) {
		int a[];
		a = new int[6]; // int[0].....int[5]

		for (int i = 1; i <= 100; i++) {

			int point = (int) (Math.random() * 9);   //0-8
			a[point>=6?point-3:point]++;

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println((i + 1) + "點出現" + a[i]);
		}
	}

}
