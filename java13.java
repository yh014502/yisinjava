package tw.org.iii.java;

public class java13 {

	public static void main(String[] args) {
		int month=2;
		switch(month){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println("31天");
			break;

		case 4:case 6:case 9:case 11:
			System.out.println("30天");
			break;
			
		case 2:
			int year;
			year=2016;
			//System.out.println("28天");
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
			break;
		}
				

	}

}
