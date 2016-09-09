package tw.org.iii.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class java38Reader {

	public static void main(String[] args) {
		File f1=new File("dir1/test.txt");
		try {
			FileReader reader=new FileReader(f1);
			//如果確定都是字元  可以直接用Reader做，BYTE則是可以處理所有事情
			int c;
			while((c=reader.read())!=-1){
				System.out.print((char)c);
			}
			reader.close();
		} catch (Exception e) {

		}

	}

}
