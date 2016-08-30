package tw.org.iii.java;

public class java12 {

	public static void main(String[] args) {
		int a =10;
		final int b=8;		 //switch中case可以是常數但不能是變數，final把int值變成常數
		switch(a){           //只適用在byte,short,int,char,"String"...long不適用
		case 1:
			System.out.println("A");
			break;          
		case 10:
			System.out.println("B");
			//break;          //break敘述句可以省略，但結果會執行下一行case直到遇到break
		case b:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}

	}

}
