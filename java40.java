package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;


public class java40 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("dir1/Book1.csv");
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			String line;
			while((line = br.readLine())!=null){
				String[] row = line.split(",");
				System.out.println("Name:" + row[0] + 
					"\t Tel:" + row[1] + 
					"\t Addr.:" + row[2]);
			}
			isr.close();
		} catch (Exception e) {

		}

	}

}
