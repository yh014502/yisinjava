package tw.org.iii.java;

public class java32Abstract {

	public static void main(String[] args) {
		java321 obj1=new java321();
		java322 obj2=new java323();
//		java324 obj3=new java324();
		
		
		
		
	}
}
class java321{
	void m1(){}
}

//如果類別有抽象類別那整個類別都是抽象類別
abstract class java322{
	java322(){
		System.out.println("java322建構式");
	}
	void m1(){}
	abstract void m2();
}
class java323 extends java322{
	void m2(){System.out.println("java323:m2()");}
}
class java324 extends java322{
	void m2(){System.out.println("java324:m2()");}
}