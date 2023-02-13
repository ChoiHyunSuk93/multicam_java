package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임 만들기
		// 2. 프레임 설정, 실행해서 눈으로 확인
		// 레이아웃 부품 설정하지 않음
		// 3. 버튼을 넣을 배열을 만들기
		// 4. 버튼을 500개 만들어서 배열에 넣기
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정후, f에 붙여주기
		// 심화-1)) 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트: 칼라배열
		// 심화-2)) f에 배경색을 넣어보세요

		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setLayout(null);
		
		JButton[] buttons = new JButton[500];
		
		Color[] colors = { Color.red, Color.yellow, Color.blue, Color.cyan, Color.LIGHT_GRAY }; // 칼라 배열
		
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i); // 버튼 배열에 넣기
			int x = r.nextInt(900); // 버튼 x축 위치 랜덤
			int y = r.nextInt(700); // 버튼 y축 위치 랜덤
			buttons[i].setBounds(x, y, 100, 50); // 버튼 위치 설정
			buttons[i].setBackground(colors[r.nextInt(colors.length)]); // 버튼에 배경색 랜덤으로 넣기
			f.add(buttons[i]); // f에 버튼 붙이기
		}
		f.getContentPane().setBackground(Color.pink);
		f.setVisible(true);

	}

}
