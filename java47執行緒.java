package tw.org.iii.java;

public class java47執行緒 {
	public static void main(String[] args) {
		java471 obj1=new java471("A");
		java471 obj2=new java471("B");
		//runable不是執行緒，需將值再給Thread才可以Start
		java472 obj3=new java472("c");
		Thread t1=new Thread(obj3);
		t1.start();
		//start方法只能執行一次，第二次則會出現例外
//		obj1.start();
		obj1.start();
		obj2.start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}
		System.out.println("main");
		obj2.interrupt();
	
		
		

	}

}
class java471 extends Thread{
	String name;
	java471(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
class java472 implements Runnable{
	String name;
	java472(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}