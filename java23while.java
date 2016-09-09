package tw.org.iii.java;

public class java23while {

	public static void main(String[] args) {
		int i=1;
		int sum=0;  //要給值
		int n=10;
		while(i<=n){
			sum += i++;		
		}
		System.out.println(sum);
	}

}
