package tw.org.iii.java;

public class java21二維陣列 {

	public static void main(String[] args) {
		int[][] a;
		int[] b[];
		int c[][];
		a = new int[3][4];
		b = new int[3][];
		// c=new int [][2]; //第一個陣列一定要有定義
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4]; // 定義b[]之後的陣列數量

		b[0][1] = 2;
		b[1][2] = 3;
		b[2][3] = 4;

		for (int[] v : b) {      //先查b[]的第二層
			for (int vv : v) {   //在看b[]的第一層
				System.out.print(vv+" ");
			}
			System.out.println();    
		}

//		 for(int i=0;i<b.length;i++){
//		 for(int j=0;j<b[i].length;j++){
//		 System.out.print(b[i][j]+" ");
//		 }
//		 System.out.println("-----");
//		 }
		int[] d = new int[3];
		for (int v : d) {
			System.out.println(v);
		}
		System.out.println("------");
		int e[]={1,2,3,4,5};
		int f[]=new int[]{6,7,8,9,10};   //兩種寫法都可以
	}
		
}
