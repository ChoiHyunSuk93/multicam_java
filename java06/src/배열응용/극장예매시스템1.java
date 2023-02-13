package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(1000, 1000);
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("D2Coding", Font.BOLD, 50); // 토탈 버튼 폰트
		Font font2 = new Font("D2Coding", Font.BOLD, 30); // 결과 보이는 곳 폰트
		Font font3 = new Font("D2Coding", Font.BOLD, 25); // 좌석 버튼 폰트

		JButton[] button = new JButton[200];
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font2);

		// 예약 여부를 저장하는 배열을 만들어 줍시다!
		int[] seat = new int[button.length];
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton((i + 1) + "");
			button[i].setFont(font3);
			f.add(button[i]);
			button[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand();
					int no = Integer.parseInt(text) - 1; // 버튼을 1번부터 나오게 해서 -1 해서 인덱스 확인
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인
					// 예약가능 불가능 좌석 확인버전
//					if (seat[no] == 1) {
//						result.setText("이미 예약된 좌석입니다");
//						result.setForeground(Color.blue);
//					} else {
//						seat[no] = 1;
//						result.setForeground(Color.red);
//						result.setText(text + "번이 예약되었습니다.");
//					}
					// 에약된 좌석 선택 불가버전
					if (seat[no] != 1) {
						seat[no] = 1;
						result.setForeground(Color.red);
						result.setText(text + "번이 예약되었습니다.");
						button[no].setBackground(Color.red);
						button[no].setEnabled(false);
					} // if

				}

			});

		} // for
		f.add(result);

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
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
