package tw.org.iii.java;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class Drawer extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines,recyle;

	public Drawer() {
		Mylistener listener = new Mylistener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		recyle=new LinkedList<>();
		lines = new LinkedList<>();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		// 設定顏色
		g2d.setColor(Color.blue);
		// 設定線條粗細
		g2d.setStroke(new BasicStroke(4));
		// 線條
		for (LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i = 1; i < line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i - 1);
				HashMap<String, Integer> p1 = line.get(i);
				Integer p0x = p0.get("x"), p0y = p0.get("y");
				Integer p1x = p1.get("x"), p1y = p1.get("y");
				g2d.drawLine(p0x, p0y, p1x, p1y);
			}
		}
	}
	void clear(){
		lines.clear();
		repaint();
	}
	void undo(){
		if(lines.size()>0){
		recyle.add(lines.removeLast());
		repaint();
		}
	}
	void redo(){
		if(recyle.size()>0){
		lines.add(recyle.removeFirst());
		repaint();
		}
	}
	private class Mylistener extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			int x = e.getX(), y = e.getY();
			HashMap<String, Integer> point = new HashMap<>();
			// 抓取point
			point.put("x", x);
			point.put("y", y);
			// line增加點在最後一條線
			lines.getLast().add(point);
			// line.add(point);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			int x = e.getX(), y = e.getY();
			// 將點已HashMap存入
			HashMap<String, Integer> point = new HashMap<>();
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			// 抓取point
			point.put("x", x);
			point.put("y", y);
			// line增加點
			line.add(point);
			lines.add(line);
		}
	}
}
