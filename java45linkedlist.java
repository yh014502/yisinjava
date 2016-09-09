package tw.org.iii.java;

import java.util.LinkedList;

public class java45linkedlist {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(12);
		list.add(12);
		list.add("yisin");
		list.add(true);
		//目前只有0123，但下一個ADD卻指定7位置，雖然編譯成功但執行卻會跑出例外
		list.add(7,"yisin");
		System.out.println(list.toString());

	}

}
