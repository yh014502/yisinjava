package tw.org.iii.java;

public class Bike {
	private double speed;  //定義speed並且設為私人的
	private int color;
	
	Bike(){					//建構式
		System.out.println("Bike()");
		color=2;
		
	}
	
	Bike(int c){					//建構式同名異事
		System.out.println("Bike(int)");
		color=c;
		
	}
	
	void upspeed(){
		speed=(speed<1?1:speed*1.2);
	}
	void upspeed(int gear){
		speed=(speed<1?1:speed*(1.2+gear));   //同名異事加速度方法
	}
	
	void downspeed(){
		speed=(speed<1?0:speed*0.7);
	}
	double getspeed(){   //設定類似計速器(getspeed)去抓取私人的速度以便讀取
		return speed;
	}
//	@Override
//	public String toString() {    //改變toString的值
//		
//		return "Yisin Bike";
//	}
}
