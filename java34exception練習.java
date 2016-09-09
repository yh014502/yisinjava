package tw.org.iii.java;

import javax.management.RuntimeErrorException;

public class java34exception練習 {

	public static void main(String[] args) {
		bird obj1 = new bird();

		try {
			obj1.setleg(-2);
		} catch (Exception ee) {

		}

	}

}

class bird {
	int leg;
	//定義Exception在上方一定要執行TRY  如果是runtime可執行可不執行
	void setleg(int n) throws Exception {
		if (n > 3 | n < 0) {

			throw new RuntimeException();
			// throw new Exception();
		}
		leg = n;
	}
}