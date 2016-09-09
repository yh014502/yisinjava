package tw.org.iii.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class java30視窗程式 extends JFrame implements ActionListener {
	private JButton open, save, exit;

	java30視窗程式() {
		super("yisin視窗");

		setLayout(new FlowLayout());
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		add(open);
		add(save);
		add(exit);

		
		//3個都呼叫this 在下方寫IF迴圈判斷
		//放東西的概念先執行的會被放在最下面，所以讀取的時候是最後執行的在最上面
		open.addActionListener(this);
		open.addActionListener(new myListener());
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("yisin");
				
			}
		});
		save.addActionListener(this);
		exit.addActionListener(this);
		// 3種方法使用addactionlistener
//		open.addActionListener(this);
//		save.addActionListener(new myListener());
//		exit.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//
//			}
//		});

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// 呼叫JFrame的方法關閉視窗
	}

	public static void main(String[] args) {
		new java30視窗程式();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==open){
			System.out.println("open");
		}else if(e.getSource()==save){
			System.out.println("save");
		}else if(e.getSource()==exit){
			System.exit(0);
		}

	}

}

class myListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("save");

	}

}
