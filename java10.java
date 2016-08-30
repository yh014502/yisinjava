package tw.org.iii.java;
//TOTD 還未完成
public class java10 {

	public static void main(String[] args) {
		int year;
		year=2016;
		
		if(year%4==0){
			//可被4整除
			if(year%100==0){
				//可被4、100整除
				if(year%400==0){
					//可被4、100、400整除
					//29
					System.out.println("29天");
				}else{
					//可被4、100整除但400不能
					//28
					System.out.println("28天");
				}
			}else{
				//可被4整除但100不能
				//29
				System.out.println("29天");
			}
		}else{
			//不可被4整除
			//28
			System.out.println("28天");
		}
		
		
		
		
//		if((year%4==0)||(year%400==0)&&(year%100!=0)){
//			System.out.println("閏年");
//		}else{
//			System.out.println("不是閏年");
//		}

	}

}
