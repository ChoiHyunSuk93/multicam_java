package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame(); // 전체 틀
		f.setSize(300, 600);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel headline = new JLabel(); // 헤드라인
		headline.setText("K-pop 인기 투표");

		JLabel l1 = new JLabel();
		l1.setText("1.아이유 - 라일락");
		JLabel l11 = new JLabel(); // 아이유투표수 출력칸

		JLabel l2 = new JLabel();
		l2.setText("2.프로미스나인 - we go");
		JLabel l22 = new JLabel(); // 프로미스나인투표수 출력칸

		JLabel l3 = new JLabel();
		l3.setText("3.스테이시 - ASAP");
		JLabel l33 = new JLabel(); // 스테이시투표수 출력칸

		// 투표 버튼
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();

		// 버튼 이미지
		ImageIcon icon1 = new ImageIcon("iu.PNG");
		ImageIcon icon2 = new ImageIcon("p9.PNG");
		ImageIcon icon3 = new ImageIcon("sta.PNG");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);

		// 폰트
		Font font1 = new Font("D2Coding", 1, 30);
		Font font2 = new Font("D2Coding", 1, 20);
		headline.setFont(font1);
		l1.setFont(font2);
		l11.setFont(font2);
		l2.setFont(font2);
		l22.setFont(font2);
		l3.setFont(font2);
		l33.setFont(font2);

		// 부품조립
		f.add(headline);
		f.add(b1);
		f.add(l1);
		f.add(l11);
		f.add(b2);
		f.add(l2);
		f.add(l22);
		f.add(b3);
		f.add(l3);
		f.add(l33);

		// 버튼 액션 설정

		b1.addActionListener(new ActionListener() {
			int iu = 0; // 아이유 득표수

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				iu++;
				l11.setText(iu + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int p9 = 0; // 프로미스나인 득표수

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p9++;
				l22.setText(p9 + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int st = 0; // 스테이시 득표수

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				st++;
				l33.setText(st + "표");
			}
		});

		// 출력
		f.setVisible(true);
	}

}
