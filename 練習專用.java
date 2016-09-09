package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 練習專用 {

	public static void main(String[] args) throws IOException{
		System.out.println("請輸入字串");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println("輸入要找的字");
		String str2=br.readLine();
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);

	}

}
