package 마무리정리;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ThreadClass extends Thread{
	int x, y;
	JLabel label;
	public ThreadClass(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100);
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
