package tw.org.iii.java;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class booktest {

	public static void main(String[] args) {
		int[] a=new int[10];
		for(int i=0;i<a.length;i++){
			int temp;
			temp=(int)(Math.random()*100+1);
			a[i]=temp;
		}
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.println("最大值為:"+max);
		for(int s=0;s<a.length-1;s++){
			for(int j=s+1;j<a.length;j++){
				if(a[j]>a[s]){
					int temp=a[j];
					a[j]=a[s];
					a[s]=temp;
				}
			}
		}
		for(int v:a){
			
			System.out.print(v+"\t");
		}
		
		
	}

}
