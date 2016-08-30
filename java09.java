package tw.org.iii.java;

public class java09 {

	public static void main(String[] args) {
		double temp=Math.random();
		int score=(int)(temp*101);   //欲產生1-100
		System.out.println(score);
		
		
		
		
//		int level=score/10;    //switch 寫法
//		switch(level){
//		case 10:
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("c");
//			break;
//		case 6:
//			System.out.println("D");
//		default:
//			System.out.println("E");	
//		}
		
		
		//if 寫法
		if(score>=90){
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=70){
			System.out.println("c");
		}else if(score>=60){
			System.out.println("D");
		}else
			System.out.println("E");
		}
				
		
	
}
