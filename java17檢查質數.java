package tw.org.iii.java;

public class java17檢查質數 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			
			boolean isP=true;
			
			for(int j=2;j<=i/2;j++){   //判斷是否為質數
				if(i%j==0){
					isP=false;
					break;
				}
			}
			System.out.print(i+(isP?"*":"")+"\t");
			if (i%10==0){
				System.out.println();
			}
			
		}

	}

}
