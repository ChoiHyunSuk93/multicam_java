package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의영화앨범 {

	static int index = 2; // 현재 시작 위치

	public static void main(String[] args) {
		String[] names = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "1.PNG", "2.PNG", "3.PNG", "4.PNG", "5.PNG" };
		double[] point = { 9.28, 9.72, 8.82, 6.62, 8.85 };

		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.green);

		JLabel top = new JLabel(names[index]);
		JLabel center = new JLabel();
		JLabel under = new JLabel(String.valueOf(point[index]));
		JButton rButton = new JButton(">>");
		JButton lButton = new JButton("<<");

		// 센터 이미지
		ImageIcon icon = new ImageIcon(img[index]);
		center.setIcon(icon);

		// 위치 가운데 정렬
		top.setHorizontalAlignment(0);
		center.setHorizontalAlignment(0);
		under.setHorizontalAlignment(0);

		// 색 설정
		under.setForeground(Color.blue);
		rButton.setBackground(Color.pink);
		rButton.setForeground(Color.blue);
		lButton.setBackground(Color.pink);
		lButton.setForeground(Color.blue);

		// 폰트 설정
		Font font = new Font("D2Coding", Font.BOLD, 40);
		top.setFont(font);
		under.setFont(font);
		rButton.setFont(font);
		lButton.setFont(font);

		// 배치부품(객체)를 바꾸어주지 않으면 경계 레이아웃을 사용하도록 셋팅
		// BorderLayout
		// 틀 끼워넣기
		f.add(top, BorderLayout.NORTH);
		f.add(center, BorderLayout.CENTER);
		f.add(under, BorderLayout.SOUTH);
		f.add(rButton, BorderLayout.EAST);
		f.add(lButton, BorderLayout.WEST);

		// 버튼 처리
		rButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (index < names.length - 1) {
					top.setText(names[index + 1]);
					under.setText(point[index + 1] + "");
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					index++;
				} else { // 오른쪽 맨 끝에서 누르면 다시 맨 왼쪽으로 돌아가도록 반복
					index = 0;
					top.setText(names[index]);
					under.setText(point[index] + "");
					ImageIcon icon = new ImageIcon(img[index]);
					center.setIcon(icon);
				}

			}
		});
		lButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (index > 0) {
					top.setText(names[index - 1]);
					under.setText(point[index - 1] + "");
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					index--;
				} else { // 왼쪽 맨 끝에서 누르면 다시 맨 오른쪽으로 돌아가도록 반복
					index = 4;
					top.setText(names[index]);
					under.setText(point[index] + "");
					ImageIcon icon = new ImageIcon(img[index]);
					center.setIcon(icon);
				}

			}
		});
		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
