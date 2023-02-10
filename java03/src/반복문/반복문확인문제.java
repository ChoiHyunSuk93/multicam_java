package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 300);

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();

		b1.setText("별 10개");
		b2.setText("커피*5");
		b3.setText("커피*우유3");
		b4.setText("1 : 짱!");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", 0, 35);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		// 1)버튼에다가 액션기능을 추가하겠다고 설정
		// 2)클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지 코딩
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용!!
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " : 짱!");
				}
			}
		});

		f.getContentPane().setBackground(Color.green);
		b1.setBackground(Color.MAGENTA);
		b2.setBackground(Color.cyan);
		b3.setBackground(Color.MAGENTA);
		b4.setBackground(Color.cyan);

		f.setVisible(true);

	}

}
