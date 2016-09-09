package tw.org.iii.java;

public class java31介面 {

	public static void main(String[] args) {
		java31介面2 obj1=new java31介面2();
		java31介面3 obj2=new java31介面3();
		
		java31介面4 obj3=new java31介面4();
		obj3.m3(obj1);
	}

}

interface java31介面1 {
	void m1();

	void m2();
}

class java31介面2 implements java31介面1 {
	public void m1() {
		System.out.println("java31介面2:m1()");
	} // 呼叫介面的方法須加public

	public void m2() {
		System.out.println("java31介面2:m2()");
	}
}
class java31介面3 implements java31介面1 {
	public void m1() {
		System.out.println("java31介面3:m1()");
	} // 呼叫介面的方法須加public

	public void m2() {
		System.out.println("java31介面3:m2()");
	}
}
class java31介面4{
	void m3(java31介面1 b){
		b.m1();
	}
}