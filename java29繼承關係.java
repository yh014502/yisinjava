package tw.org.iii.java;

public class java29繼承關係 {

	public static void main(String[] args) {
	yisin11 obj1=new yisin11(2);
//	obj1.m1();
	yisin12 obj2=new yisin12();
//	obj2.m1();
//	obj2.m2();
	yisin13 obj3=new yisin13();
	}

}
class yisin11{
	yisin11(int n){System.out.println("i am father");};
	int a=100;   //屬性也有繼承方法
	void m1(){System.out.println("hello");}
}
class yisin12 extends yisin11{
	yisin12(){
		super(123456);
		System.out.println("i am son");

	}
	void m1(){
		super.m1();
		System.out.println("test:"+a);}
	void m2(){System.out.println("hi");}
}
class yisin13 extends yisin12{
	yisin13(){
		System.out.println("QQ");
	}
}