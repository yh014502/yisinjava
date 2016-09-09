package tw.org.iii.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class java37 {

	public static void main(String[] args) {
		File f1=new File("dir1/test.txt");
//		System.out.println(f1.getAbsolutePath());  //查看f1在哪個路徑底下
		
//		if(f1.exists()){       //測試是否存在
//			System.out.println("OK");
//		}
		long len=f1.length();   //f1的大小
		System.out.println(len);
		try {
			FileInputStream fis=new FileInputStream(f1);
			//定義C  將FIS讀進C
			int c;
			byte []buf=new byte[(int)len];
			c=fis.read(buf);
			System.out.print(new String(buf));
			
			
//			int c;byte []buf=new byte[3];
//			while((c=fis.read(buf))!=-1){
//				System.out.print(new String(buf,0,c));   
//			}
			
			
			fis.close();   //關閉檔案
		} catch (Exception e) {
		
		}

	}

}
