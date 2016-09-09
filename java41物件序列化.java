package tw.org.iii.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class java41物件序列化 {

	public static void main(String[] args) {
		student s1=new student("yisin",80,70,56);
		System.out.println(s1.getscore());
		System.out.println(s1.getavg());
		try {
			ObjectOutputStream oos=new ObjectOutputStream(
					new FileOutputStream("dir1/s.dat"));
			oos.writeObject(s1);
			oos.flush();
			oos.close();
		} catch (IOException e) {
		System.out.println(e.toString());
		}
	}

}
class student implements Serializable{
	String name;
	int ch,eng,math;
	student(String name,int ch,int eng,int math){
		this.name=name;
		this.ch=ch;this.eng=eng;this.math=math;
	}
	int getscore(){
		return ch+eng+math;
	}
	double getavg(){
		return getscore()/3.0;
	}
}
