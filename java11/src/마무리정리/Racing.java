package 마무리정리;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {

	public static void main(String[] args) {
		new Racing();
	}

	public Racing() {
		setTitle("자동차 경주 게임");
		setSize(700, 500);
		setLayout(null);
		getContentPane().setBackground(Color.green);

		ThreadClass2 car1 = new ThreadClass2("car01.png", 0, 10);
		ThreadClass2 car2 = new ThreadClass2("car02.png", 0, 160);
		ThreadClass2 car3 = new ThreadClass2("car03.png", 0, 310);

		car1.start();
		car2.start();
		car3.start();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class ThreadClass2 extends Thread {
		int x, y;
		JLabel label;

		public ThreadClass2(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
		}

		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 50; i++) {
				int move = r.nextInt(50) + 1;
				x += move;
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
