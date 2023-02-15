package 메서드연습;

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

public class 스타벅스주문하기 {

	static int coffee1; // 1번음료 갯수
	static int coffee2; // 2번음료 갯수
	static int coffee3; // 3번음료 갯수
	static int price1 = 3000; // 1번음료 가격
	static int price2 = 4000; // 2번음료 가격
	static int price3 = 3500; // 3번음료 가격

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1000, 500);
		f.setTitle("스타벅스 키오스크");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		ImageIcon icon1 = new ImageIcon("coldbrew.PNG"); // 콜드브루
		ImageIcon icon2 = new ImageIcon("caramel.PNG"); // 카라멜마끼아또
		ImageIcon icon3 = new ImageIcon("latte.PNG"); // 라떼

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton("주문하기");

		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);

		b1.setBorderPainted(false);
		b2.setBorderPainted(false);
		b3.setBorderPainted(false);

		JLabel listLabel = new JLabel();
		JLabel priceLabel = new JLabel();

		// 폰트 설정
		Font font = new Font("D2Coding", Font.BOLD, 30);
		listLabel.setFont(font);
		priceLabel.setFont(font);
		b4.setFont(font);

		// 색 설정
		f.getContentPane().setBackground(Color.GREEN);
		b1.setBackground(Color.green);
		b2.setBackground(Color.green);
		b3.setBackground(Color.green);
		b4.setBackground(Color.cyan);
		b4.setForeground(Color.black);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(listLabel);
		f.add(priceLabel);
		f.add(b4);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				coffee1++;
				listLabel.setText("콜드브루 : " + coffee1 + "잔, 카라멜마끼아또 : " + coffee2 + "잔, 바닐라라떼 : " + coffee3 + "잔");
				int totalprice = (coffee1 * price1) + (coffee2 * price2) + (coffee3 * price3);
				priceLabel.setText("전체 금액은 : " + totalprice + "입니다.");
			}
		}); // b1 add end

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				coffee2++;
				listLabel.setText("콜드브루 : " + coffee1 + "잔, 카라멜마끼아또 : " + coffee2 + "잔, 바닐라라떼 : " + coffee3 + "잔");
				int totalprice = (coffee1 * price1) + (coffee2 * price2) + (coffee3 * price3);
				priceLabel.setText("전체 금액은 : " + totalprice + "입니다.");
			}
		}); // b2 add end

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				coffee3++;
				listLabel.setText("콜드브루 : " + coffee1 + "잔, 카라멜마끼아또 : " + coffee2 + "잔, 바닐라라떼 : " + coffee3 + "잔");
				int totalprice = (coffee1 * price1) + (coffee2 * price2) + (coffee3 * price3);
				priceLabel.setText("전체 금액은 : " + totalprice + "입니다.");
			}
		}); // b3 add end

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int totalprice = (coffee1 * price1) + (coffee2 * price2) + (coffee3 * price3);
				JOptionPane.showMessageDialog(f, "총 " + totalprice + "원 결제되었습니다.");
				f.setVisible(false); // 화면 꺼지기
			}
		}); // b4 add end

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
