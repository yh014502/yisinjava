package tw.org.iii.java;

public class java08 {

	public static void main(String[] args) {
		int a=10,b=0;
//		System.out.println(a/b);
		double c=10,d=0;
		System.out.println(c/d);   //double的0為非常接近0的數值，所以除出來會無限大
		
		int e=1,f=3;
		int g=e ^ f;   //&和| 須將值轉成2進位進行判斷e=1:01 f=2:10，&判斷出來00，|判斷出來11，^代表XOR同性相斥異性相吸e=1:01 f=3:11結果10
		System.out.println(g);

	}

}
