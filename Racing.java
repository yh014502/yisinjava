package tw.org.iii.java;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Racing extends JFrame{
	private JButton go;
	private JLabel[] lines;
	private int rank;
	public Racing(){
		super("Racing GO");
		setLayout(new GridLayout(9, 1));
		go=new JButton("GO!!~");add(go);
		lines=new JLabel[8];
		for(int i=0;i<lines.length;i++){
			lines[i]=new JLabel((i+1) + ". ");
			add(lines[i]);
		}
	
		
		setSize(1024, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		go.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
	}
	private void go(){
		rank=0;
		car[] cars=new car[8];
		for (int i=0; i<cars.length; i++){
			cars[i] = new car(i);
		}
		for (int i=0; i<cars.length; i++){
			cars[i].start();
		}
		
	}
	private class car extends Thread{
		private int num;
		car(int num){this.num = num;}
		@Override
		public void run() {
			for (int i=0; i<100; i++){
				lines[num].setText(lines[num].getText()+">");
				if(i==99){
					lines[num].setText(lines[num].getText()+ ++rank);
				}
				try {
					Thread.sleep(30+(int)(Math.random()*170));
				} catch (InterruptedException e) {		
				}
			}
		}
		
	}
	public static void main(String[] args) {
		new Racing();
	}

}
