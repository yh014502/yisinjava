package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class java42 {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois=new ObjectInputStream(
					new FileInputStream("dir1/s.dat"));
			Object obj = ois.readObject();
			student s1 = (student)obj;
			ois.close();
			System.out.println(s1.getavg());
			System.out.println(s1.getscore());
		} catch (Exception e) {
		System.out.println(e.toString());
		}

	}

}
