package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*; // *표시를 해서 swing 밑에 있는 여러가지를 다 쓴다. 
import javax.swing.JFrame;

public class 부품만들기2 {

	public static void main(String[] args) {
		// 전체 틀 생성
		JFrame f = new JFrame();
		f.setSize(500, 150);

		// 물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓기
		// Flowlayout
		FlowLayout flow = new FlowLayout();

		// 'f에 물 흐르듯이 배치해주는 부품을 쓰겠다'라고 조립.
		f.setLayout(flow);

		// 버튼 생성
		JButton b1 = new JButton();
		b1.setText("나는 버튼");
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");

		// 글씨 넣기
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		JLabel text2 = new JLabel();
		text2.setText("패스워드");

		// 입력창 넣기
		JTextField input1 = new JTextField(10); // ()숫자는 몇 글자까지 치는지 설정
		JTextField input2 = new JTextField(10);

		Font font = new Font("궁서", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);

		b1.setBackground(Color.red); // 배경색
		b1.setForeground(Color.white); // 버튼의 위색, 글자색
		b2.setBackground(Color.red); // 배경색
		b2.setForeground(Color.white); // 버튼의 위색, 글자색
		input1.setBackground(Color.red); // 배경색
		input1.setForeground(Color.white); // 버튼의 위색, 글자색
		input2.setBackground(Color.red); // 배경색
		input2.setForeground(Color.white); // 버튼의 위색, 글자색
		
		ImageIcon icon1 = new ImageIcon("1.jpg");
		ImageIcon icon2 = new ImageIcon("2.jpg");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		// 틀에 넣기
		f.add(text1);
		f.add(input1);
		f.add(b1);

		f.add(text2);
		f.add(input2);
		f.add(b2);

		// 최종 보여주기
		f.setVisible(true);

	}

}
