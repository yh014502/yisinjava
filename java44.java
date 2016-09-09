package tw.org.iii.java;

import java.util.TreeSet;

public class java44 {

	public static void main(String[] args) {
		//不重複無順序性HashSet
//		HashSet set=new HashSet();
		//可排序TreeSet，型別需相同型別才可以比較
		TreeSet set=new TreeSet();
		while(set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
		
		
		//foreach方式抓出效果相當於迭帶
		for(Object obj:set){
			System.out.println((Object) obj);
		}
			
	}

}
