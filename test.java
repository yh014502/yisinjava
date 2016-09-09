package tw.org.iii.java;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		//答案
		String answer=creatAnswer(4);
		System.out.println(answer);
		//開始
		boolean isWinner=false;
		for(int i=0;i<3;i++){
		//猜數字
		String guess=JOptionPane.showInputDialog("請輸入要猜的數字");
			
		//比較
		if(guess.equals(answer)){
			isWinner=true;
			break;
		}
		String result=checkAB(answer,guess);
		System.out.println(guess+"  "+result);
		JOptionPane.showMessageDialog(null, guess+":"+result);
		
		}
		//輸贏
		if(isWinner){
			JOptionPane.showMessageDialog(null, "恭喜成功");
		}else{
			JOptionPane.showMessageDialog(null, "重頭來過吧");
		}

	}
	static String creatAnswer(int n){
		int[] poker = new int[n];
		for (int i = 0; i < poker.length; i++) {
			int temp;

			// 檢查機制(是否重複)
			boolean isRepeat;
			do {
				temp = (int) (Math.random() * 10 );
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);
			poker[i] = temp;
		}
		String ret="";
		for(int v:poker){
			ret +=v;
		}
		return ret;
	}
	
	
	
	static String checkAB(String a,String g){
		int A,B;A=B=0;
		for(int i=0;i<g.length();i++){
			if(g.charAt(i)==a.charAt(i)){
				A++;
			}else if(a.indexOf(g.charAt(i))!=-1){
				B++;
			}
		}
		return A+"A"+B+"B";
	}

}
