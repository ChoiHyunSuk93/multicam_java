package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(300, 250);
		f.setTitle("나의 카운터 프로그램");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("+1");
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("-1");

		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(0);

		Font font1 = new Font("D2Coding", Font.BOLD, 20);
		Font font2 = new Font("D2Coding", Font.BOLD, 100);
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		label.setFont(font2);

		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		b1.setBackground(Color.green);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b3.setBackground(Color.green);
		label.setForeground(Color.red);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				label.setText(count + "");
			}
		}); // b1 add end

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count = 0;
				label.setText(count + "");
			}
		}); // b2 add end

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count--;
				label.setText(count + "");
			}
		}); // b3 add end

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
