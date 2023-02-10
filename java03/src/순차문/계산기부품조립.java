package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기부품조립 {

	public static void main(String[] args) {
		// 필요한 부품
		// JFrame, ImageIcon, JLabel 3개
		JFrame frame = new JFrame();
		frame.setSize(250, 400);
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);

		ImageIcon icon = new ImageIcon("011.jpg");

		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();

		label1.setIcon(icon);
		label2.setText("숫자1");
		label3.setText("숫자2");

		// JTextField 2개
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);

		// Font
		Font font = new Font("굴림", 1, 20);

		// Button
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();

		button1.setText("+");
		button2.setText("-");
		button3.setText("*");
		button4.setText("/");

		// 폰트 설정
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		button1.setFont(font);
		button2.setFont(font);
		button3.setFont(font);
		button4.setFont(font);

		// 부품 프레임에 넣기
		frame.add(label1);
		frame.add(label2);
		frame.add(text1);
		frame.add(label3);
		frame.add(text2);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);

		// 색 설정
		label2.setForeground(Color.blue);
		label3.setForeground(Color.blue);
		text1.setForeground(Color.green);
		text1.setBackground(Color.yellow);
		text2.setForeground(Color.green);
		text2.setBackground(Color.yellow);
		button1.setForeground(Color.black);
		button1.setBackground(Color.white);
		button2.setForeground(Color.black);
		button2.setBackground(Color.white);
		button3.setForeground(Color.black);
		button3.setBackground(Color.white);
		button4.setForeground(Color.black);
		button4.setBackground(Color.white);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result1 = n1 + n2;
				JOptionPane.showMessageDialog(frame, result1);
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result2 = n1 - n2;
				JOptionPane.showMessageDialog(frame, result2);
			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result3 = n1 * n2;
				JOptionPane.showMessageDialog(frame, result3);
			}
		});

		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				double result4 = (double) n1 / n2;
				JOptionPane.showMessageDialog(frame, String.format("%.3f", result4));
			}
		});

		// 보여주기
		frame.setVisible(true);

	}

}