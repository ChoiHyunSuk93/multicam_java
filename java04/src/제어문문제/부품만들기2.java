package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; // *표시를 해서 swing 밑에 있는 여러가지를 다 쓴다. 
import javax.swing.JFrame;

public class 부품만들기2 {

	public static void main(String[] args) {
		// 전체 틀 생성
		JFrame f = new JFrame();
		f.setSize(400, 600);

		// 물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓기
		// Flowlayout
		FlowLayout flow = new FlowLayout();

		// 'f에 물 흐르듯이 배치해주는 부품을 쓰겠다'라고 조립.
		f.setLayout(flow);

		// 버튼 생성
		JButton b1 = new JButton();
		

		// 글씨 넣기
		JLabel main = new JLabel();
		JLabel text1 = new JLabel();
		text1.setText("아이디 입력");
		JLabel text2 = new JLabel();
		text2.setText("패스워드 입력");
		JLabel text3 = new JLabel();
		text3.setText("이름 입력");
		JLabel text4 = new JLabel();
		text4.setText("전화번호 입력");

		// 입력창 넣기
		JTextField input1 = new JTextField(10); // ()숫자는 몇 글자까지 치는지 설정
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);

		Font font = new Font("D2coding", 1, 30);
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		b1.setFont(font);
		
		ImageIcon icon = new ImageIcon("logo.PNG");
		main.setIcon(icon);
		
		b1.setBackground(Color.gray); // 배경색
		b1.setForeground(Color.blue); // 버튼의 위색, 글자색
		
		input1.setBackground(Color.green); // 배경색
		input1.setForeground(Color.white); // 버튼의 위색, 글자색
		input2.setBackground(Color.green); // 배경색
		input2.setForeground(Color.white); // 버튼의 위색, 글자색
		input3.setBackground(Color.green); // 배경색
		input3.setForeground(Color.white); // 버튼의 위색, 글자색
		input4.setBackground(Color.green); // 배경색
		input4.setForeground(Color.white); // 버튼의 위색, 글자색
		
		text1.setForeground(Color.blue); // 버튼의 위색, 글자색
		text2.setForeground(Color.blue); // 버튼의 위색, 글자색
		text3.setForeground(Color.blue); // 버튼의 위색, 글자색
		text4.setForeground(Color.blue); // 버튼의 위색, 글자색
		
		b1.setText("회원가입 처리");
		// 틀에 넣기
		f.add(main);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id = input1.getText(); 
				String pw = input2.getText(); 
				String name = input3.getText(); 
				String phone = input4.getText();
				String result = "아이디 : " + id + "\r\n" + 
								"패스워드 : " + pw + "\r\n" + 
								"이름 : " + name + "\r\n" + 
								"전화번호 : " + phone + "\r\n";
				JOptionPane.showMessageDialog(f, result);
			}
		});

		// 최종 보여주기
		f.setVisible(true);

	}

}
