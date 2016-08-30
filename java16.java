package tw.org.iii.java;

public class java16 {

	public static void main(String[] args) {
		Yisin:             //標籤一定要緊跟著迴圈
		for (int j=5;j>0;j--)
		for(int i=0;i<5;i++){
			System.out.println(i+":"+j);
			if(i==3){
				break Yisin;    //跳到標籤
			}
		}

	}

}
