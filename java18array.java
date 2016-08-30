package tw.org.iii.java;

public class java18array {

	public static void main(String[] args) {
		boolean [] a;
		int b[];    //兩種寫法  上方的比較好
		a=new boolean [3];    //整數型態陣列預定為0，float預定為0.0，boolean預定為false，char預定為正方形框框
		b=new int [4];
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);

		}
		
	}

}
