package tw.org.iii.java;

public class java04 {

	public static void main(String[] args) {
		byte a=126; //127,128,129=>int
		a++;		//byte 最大到正127，超過的話，這邊的++會進行位移，變負-128    
		a+=5;
		System.out.println(a);
		long b;
		b=12L;
		b=12;
		//a=b;  //無法把定義不同的數互相呼叫
		long c;
		c=021;  //0開頭為8進位
		System.out.println(c);
		long d;
		d=0x21;  //0x開頭為16進位
		System.out.println(d);
		
	}

}
