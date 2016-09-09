package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPainter extends JFrame {
	private Drawer drawer;
	private JButton clear, undo, redo, save;
	private MyClock clock;

	public MyPainter() {
		super("My Painter");
		// 設置畫面
		setLayout(new BorderLayout());

		clear = new JButton("clear");
		undo = new JButton("undo");
		redo = new JButton("redo");
		save = new JButton("save");
		clock=new MyClock();
		JPanel TOP=new JPanel(new BorderLayout());
		JPanel TOPLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel TOPRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		TOP.add(TOPLeft,BorderLayout.WEST);
		TOP.add(TOPRight,BorderLayout.EAST);
		TOPLeft.add(clear);
		TOPLeft.add(undo);
		TOPLeft.add(redo);
		TOPLeft.add(save);
		TOPRight.add(clock);
		add(TOP, BorderLayout.NORTH);

		drawer = new Drawer();
		// 增加drawer到BorderLayout中間
		add(drawer, BorderLayout.CENTER);
		// 畫面大小
		setSize(1024, 768);
		// 顯示畫面
		setVisible(true);
		// 案X後離開
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearDraw();
			}
		});

		undo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				undoDraw();
			}
		});
		redo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				redoDraw();
			}
		});
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveDraw();
			}
		});
	}

	private void clearDraw() {
		drawer.clear();
	}

	private void undoDraw() {
		drawer.undo();
	}

	private void redoDraw() {
		drawer.redo();
	}

	private void saveDraw() {
		BufferedImage bi = new BufferedImage(drawer.getSize().width, drawer.getSize().height,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.createGraphics();
		drawer.paint(g); 
		g.dispose();
		try {
			ImageIO.write(bi, "png", new File("dir1/test.png"));
			System.out.println("save OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		new MyPainter();
	}

}
