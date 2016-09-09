package tw.org.iii.java;

import java.util.Timer;
import java.util.TimerTask;

public class java48timer {

	public static void main(String[] args) {
		Timer timer=new Timer();
		MyTask task1 =new MyTask("A");
		MyTask task2 =new MyTask("B");
		timer.schedule(task1, 300,100);
		timer.schedule(task2, 500,200);
	}

}
class MyTask extends TimerTask{
	private int i;
	private String name;
	MyTask(String name){
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(name+":"+i++);
	}
}