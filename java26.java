package tw.org.iii.java;

public class java26 {

	public static void main(String[] args) {
		String s1 ="yisin";
		String s2 ="yisin";
		String s3 =new String("yisin");
		String s4 =new String("yisin");
		System.out.println(s1.equals(s3));  //equals 用來比較字串內容
		
		Bike b1 =new Bike();
		Bike b2 =new Bike();
		System.out.println(b1==b2);  //可以在Bike裡呼叫equals更改

	}

}
