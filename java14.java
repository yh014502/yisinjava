package tw.org.iii.java;

public class java14 {

	public static void main(String[] args) {
		int i=0;							//可定義在外面 														
		for(System.out.println("Yisin");   //進入後執行一次
			i<10 ;						   //直到條件結束，沒判斷句會產生無窮迴圈
			System.out.println("分隔線")){   //條件間以;隔開
			
			System.out.println(i++);   //執行完後++
		}

	}

}
