package tw.org.iii.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class java39outputstream {

	public static void main(String[] args) {
		try {
			//該檔案不存在會自動產生新檔
			FileOutputStream fout=new FileOutputStream("dir1/test1.txt",true);
			//此方法每次都會蓋掉之前所寫的，加上true就會變成append模式
			fout.write("Hello yisin\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("write OK");
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
