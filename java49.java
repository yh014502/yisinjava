package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class java49 extends JFrame {
	private MyGame newgame;

	public java49() {
		super("My Game!!");
		setLayout(new BorderLayout());
		newgame = new MyGame();
		add(newgame, BorderLayout.CENTER);

		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class MyGame extends JPanel {
		private Timer timer;
		private int viewW, viewH;
		private LinkedList<Ball> balls;
		private Color[] colors = { Color.BLACK, Color.blue, Color.red, Color.green };

		MyGame() {
			timer = new Timer();
			timer.schedule(new ViewTask(), 1000, 70);
			balls = new LinkedList<>();
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					balls.add(new Ball(e.getX(), e.getY(), 40, 40, 10, 10, colors[(int) (Math.random() * 4)]));
				}
			});

		}

		private class ViewTask extends TimerTask {
			@Override
			public void run() {

				repaint();
			}
		}

		private class Ball {
			int x, y, w, h, dx, dy;
			private Timer timer;
			Color color;

			Ball(int x, int y, int w, int h, int dx, int dy, Color color) {
				this.x = x;
				this.y = y;
				this.w = w;
				this.h = h;
				this.dx = dx;
				this.dy = dy;
				this.color = color;
				timer = new Timer();
				timer.schedule(new BallTask(), 0, 60);

			}

			private class BallTask extends TimerTask {
				@Override
				public void run() {
					if (x < 0 || x + w > viewW) {
						dx *= -1;
					}
					if (y < 0 || y + h > viewH) {
						dy *= -1;
					}
					x += dx;
					y += dy;

				}
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			viewW = getWidth();
			viewH = getHeight();
			for (Ball myBall : balls) {
				g2d.setColor(colors[(int) (Math.random() * 4)]);
				g2d.fillOval(myBall.x, myBall.y, myBall.w, myBall.h);
			}
		}
	}

	public static void main(String[] args) {
		new java49();

	}

}
