package tw.org.iii.java;

public class java11 {

	public static void main(String[] args) {
		int a=10,b=3;
		if(a++<=10 && b-->=3){          //++在後先判斷在++，++在前先運算在判斷   兩個&&為布林判斷，一個&為二進位判斷
			System.out.println("ok"+"，"+"a="+a+"b="+b);
		}else{
			System.out.println("xx"+"，"+"a="+a+"b="+b);
		}

	}

}
