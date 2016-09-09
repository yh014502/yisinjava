package tw.org.iii.java;

public class java33exception {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int[] d = { 1, 2, 3, 4 };

		try {
			int c = a / b;

			System.out.println(c);
			System.out.println(d[4]);
			// 如果有想要先處理的例外 要放在runtime前面 有順序關係
		} catch (ArithmeticException ae) {
			System.out.println("yisin1");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("yisin2");
			// runtimeException可以用來處理所有例外
		} catch (RuntimeException re) {
			System.out.println("runtime OK");
		}

		System.out.println("game over");
	}

}
