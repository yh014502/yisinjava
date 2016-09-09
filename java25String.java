package tw.org.iii.java;

public class java25String {

	public static void main(String[] args) {
		String a1 =new String();
		byte [] b1={97,98,99,100};
		String a2=new String(b1);
		String a3=new String(b1,2,2);
		Bike b2=new Bike();
		
		System.out.println(a1);
		System.out.println(a2);  //會呈現ascii碼
		System.out.println(a3);	 //呈現陣列裡面第三個開始的兩個數字
		System.out.println(b2);  //呈現bike所儲存的位置
	}

}
