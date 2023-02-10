package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주 써서 RAM에 언제든 사용할 수 있도록 준비되어 있음.
		// 망치
		// 부품명.기능()

		// 2. 쓸 때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어 RAM에 저장해두고 사용
		// 벽돌
		// JFrame f = new JFrame;

		// 부품 설정
		JFrame f = new JFrame();
		f.setSize(400, 300);

		JLabel label = new JLabel();
		label.setText("당신이 생각한 숫자를 입력하세요");

		JTextField text = new JTextField(10);

		JButton b = new JButton();
		b.setText("숫자를 맞춰보자!");

		Font font1 = new Font("D2", 1, 20);
		Font font2 = new Font("D2", 1, 30);

		FlowLayout flow = new FlowLayout();

		// 부품 조립
		f.setLayout(flow);
		f.add(label);
		f.add(text);
		f.add(b);

		// 폰트 설정
		label.setFont(font1);
		text.setFont(font2);
		b.setFont(font1);

		// 색 설정
		f.getContentPane().setBackground(Color.green);
		text.setBackground(Color.pink);
		text.setForeground(Color.blue);
		b.setBackground(Color.yellow);
		b.setForeground(Color.black);

		// 출력
		f.setVisible(true);
	}

}
