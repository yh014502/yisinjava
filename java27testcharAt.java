package tw.org.iii.java;

public class java27testcharAt {

	public static void main(String[] args) {
		
//		String a ="sfddfs4546af";
//		System.out.println(a.charAt(5));   //charAT練習
//		System.out.println(a.length());  //length練習
		
//		TWId b1=new TWId ("A123456789");   //測試TWId身分證是否正確
		TWId s1=new TWId(4,false);
		System.out.println(s1.getId());
		
		if(TWId.isRight(s1.getId())){
			System.out.println("OK");
		}else{
			System.out.println("xx");
		}
		
	}

}
