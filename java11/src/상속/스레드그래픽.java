package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	JLabel count, image, timer;

	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽();
	}

	public 스레드그래픽() {
		setTitle("내 스레드 그래픽");
		setSize(500, 250);
		getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		count = new JLabel("카운터");
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		timer = new JLabel("시분초");

		Font font = new Font("D2Coding", Font.BOLD, 30);
		count.setFont(font);
		timer.setFont(font);

		add(count);
		add(image);
		add(timer);

		// 스레드 객체 3개 만들어서 start!시켜보자!
		CountThread2 count2 = new CountThread2();
		ImageThread2 image2 = new ImageThread2();
		TimerThread2 timer2 = new TimerThread2();

		count2.start();
		image2.start();
		timer2.start();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// 내부 클래스(inner class) -> 전역변수를 공유할 목적으로 사용!
	// 스레드그래픽 안에 내부클래스를 3개를 끼워넣었음.
	// 전역변수를 공유할 수는 있지만, 내부클래스가 독립적으로 사용 불가능!
	
	public class CountThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트 >>" + i);

				try {
					Thread.sleep(2000); // 2초 재워라! 1초 = 1000
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}

			}

		}
	} // countthread2

	public class TimerThread2 extends Thread {

		@Override
		public void run() {

			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				timer.setText(date + "");
				try {
					Thread.sleep(1000); // 1초 재워라
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("cpu 연결 문제 생김");
				}
			}
		}
	}
	
	public class ImageThread2 extends Thread {

		@Override
		public void run() {
			String[] images = { "1.png", "2.png", "3.png", "4.png", "5.png", 
					"1.png", "2.png", "3.png", "4.png", "5.png", 
					"1.png", "2.png", "3.png", "4.png", "5.png", 
					"1.png", "2.png", "3.png", "4.png", "5.png"
					};
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("cpu 연결 문제 생김.");
				}
			}

		}
	}

}
