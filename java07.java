package tw.org.iii.java;

public class java07 {

	public static void main(String[] args) {
		byte a=10,b=3;
		int c=a+b;   //byte,short,int加減乘除取餘數都要以INT表示
		//有long以long表示進而float,double
		
		int d=a/b;  //只會傳整數值
		System.out.println(d);
		double f=a/b;  //因為AB都為整數型態，如果要得到3.33需在定義時把AB定義為double
		System.out.println(f);
		double g=10,h=3;
		double i=g/h;   //得到3.33...
		System.out.println(i);
	}

}
