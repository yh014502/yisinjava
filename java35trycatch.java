package tw.org.iii.java;

public class java35trycatch {

	public static void main(String[] args) {
		java351 obj1 = new java351();
		obj1.m1();

	}

}

class java351 {
	void m1() {
		int a = 10, b = 0;

		try {
			System.out.println(a / b);
			return;
		} catch (Exception e) {
			System.out.println("yisin");
			return;
		} finally {
			System.out.println("finally");
		}
	}
}