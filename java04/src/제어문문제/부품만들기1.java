package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; // *표시를 해서 swing 밑에 있는 여러가지를 다 쓴다. 
import javax.swing.JFrame;

public class 부품만들기1 {

	public static void main(String[] args) {
		// 전체 틀 생성
		JFrame f = new JFrame();
		f.setSize(350, 500);

		// 물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓기
		// Flowlayout
		FlowLayout flow = new FlowLayout();

		// 'f에 물 흐르듯이 배치해주는 부품을 쓰겠다'라고 조립.
		f.setLayout(flow);

		// 버튼 생성
		JButton b1 = new JButton();
		

		// 글씨 넣기
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		JLabel text3 = new JLabel();

		// 입력창 넣기
		JTextField input1 = new JTextField(10); // ()숫자는 몇 글자까지 치는지 설정
		JTextField input2 = new JTextField(10);

		Font font = new Font("D2coding", 1, 30);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		text3.setFont(font);

		b1.setBackground(Color.green); // 배경색
		b1.setForeground(Color.white); // 버튼의 위색, 글자색
		
		input1.setBackground(Color.green); // 배경색
		input1.setForeground(Color.white); // 버튼의 위색, 글자색
		input2.setBackground(Color.green); // 배경색
		input2.setForeground(Color.white); // 버튼의 위색, 글자색
		text3.setForeground(Color.red); // 버튼의 위색, 글자색
		
		ImageIcon icon1 = new ImageIcon("login.png");
	
		
		b1.setIcon(icon1);
		// 틀에 넣기
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b1);
		f.add(text3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id = input1.getText();
				String pw = input2.getText();
				if (id.equals("root") && pw.equals("1234")) {
					ImageIcon icon2 = new ImageIcon("ok.png");
					text3.setIcon(icon2);
				} else {
					ImageIcon icon3 = new ImageIcon("no.png");
					text3.setIcon(icon3);
					input1.setText("");
					input2.setText("");
				}
				
			}
		});

		// 최종 보여주기
		f.setVisible(true);

	}

}
