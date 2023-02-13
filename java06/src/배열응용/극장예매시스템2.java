package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템2 {
	static HashSet list = new HashSet();

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 500);
		f.setTitle("극장 좌석 예매하기");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font1 = new Font("D2Coding", Font.BOLD, 25); // 좌석번호 폰트
		Font font2 = new Font("D2Coding", Font.BOLD, 30); // 결과값 폰트
		Font font3 = new Font("D2Coding", Font.BOLD, 40); // 전체예매금액 버튼 폰트

		JButton[] btn = new JButton[100]; // 좌석 버튼 배열 만들고 넣기
		JLabel result = new JLabel("예매 선택 번호");
		result.setFont(font2);
		result.setForeground(Color.red);

		int[] seat = new int[btn.length]; // 좌석 예매 여부 저장하는 배열

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton((i + 1) + "");
			btn[i].setFont(font1);
			f.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String text = e.getActionCommand();
					int no = Integer.parseInt(text) - 1;
					if (seat[no] != 1) {
						seat[no] = 1;
						btn[no].setBackground(Color.red); // 누르면 빨간색
						list.add(text);
					} else {
						seat[no] = 0;
						btn[no].setBackground(null); // 다시 누르면 원래대로
						list.remove(text);
					}
					result.setText(list.toString()); // <-- 이 부분을 seat값이 1인 번호를 전부 모아서 출력하는 것으로 바꾸고 싶음
				}
			});
		}

		f.add(result); // 결과값 붙이기

		JButton total = new JButton("예매하기"); // 예매하기 버튼
		total.setFont(font3);
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		f.add(total);
		total.addActionListener(new ActionListener() {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열안에 저장된 수 몇개가 1인지 더해줌
				// 영화예매비 1장당 1만원, 결제금액 프린트
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
					} // if
				} // for
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하시면 됩니다.");
				count = 0; // 카운트 다시 초기화. 전체 버튼 여러번 눌러도 금액 변동 없도록
			}
		});

		f.setVisible(true);
	}

}
