package tw.org.iii.java;

import java.util.HashSet;

public class java43Collection {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(12.3);
		set.add("yisin");
		set.add(15);
		set.add(new student("yisin",50,60,70));
		System.out.println(set.size());
		System.out.println(set.toString());

	}

}
