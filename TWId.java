package tw.org.iii.java;
//java26可測試
public class TWId {
	private String id;
	static String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	public TWId(){
		this((int)(Math.random()*2)==0?true:false);
	}
	
	public TWId(int area){
		this(area,(int)(Math.random()*2)==0?true:false);
	}
	
	public TWId(boolean gender){
		this((int)(Math.random()*26),gender);
	}
	
	public TWId(int area,boolean gender){
		String temp=check.substring(area, area+1);
		temp +=gender?"2":"1";
		for(int i=0;i<7;i++){
		temp+=(int)(Math.random()*10);
		}
		for(int j=0;j<10;j++){
			if(isRight(temp+j)){
				id=temp+j;
				break;
			}
		}
		
	}
	
	public String getId(){
		return id;
	}


	public TWId(String id) {
		this.id = id;
	}

	int getArea() {
		return 1;
	}

	// woman=true=2 man=fales=1
	boolean getGender() { // 判斷性別
		return id.charAt(1) == 2;
	}

	static boolean isRight(String id) {       //宣告所有程式都可以使用TWId.isRight
		boolean ret = false;
		if (id.matches("^[A-Z][12][0-9]{8}$")) {
			// 驗證是否正確
			
			int pos = check.indexOf(id.charAt(0));
		
			int n12 = pos + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3=Integer.parseInt(id.substring(1,2));
			int n4=Integer.parseInt(id.substring(2,3));
			int n5=Integer.parseInt(id.substring(3,4));
			int n6=Integer.parseInt(id.substring(4,5));
			int n7=Integer.parseInt(id.substring(5,6));
			int n8=Integer.parseInt(id.substring(6,7));
			int n9=Integer.parseInt(id.substring(7,8));
			int n10=Integer.parseInt(id.substring(8,9));
			int n11=Integer.parseInt(id.substring(9,10));
			int sum=n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
			
			ret =sum%10==0;
		}
		return ret;

	}

}
