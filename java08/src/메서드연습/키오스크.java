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

public class 키오스크 {
	static int jjamCount;
	static int wooCount;
	static int jajangCount;

	final static int JJAMPRICE = 3500; // final은 변경 불가, 상수
	final static int WOOPRICE = 3000;
	final static int JAJANGPRICE = 4000;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(600, 600);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setTitle("중국집 키오스크");

		JButton b1 = new JButton("짬뽕");
		JButton b2 = new JButton("우동");
		JButton b3 = new JButton("짜장");

		JLabel topLabel = new JLabel("개수 : ");
		JLabel countLabel = new JLabel("0 개");
		JLabel imgLabel = new JLabel();
		JLabel priceLabel = new JLabel("결제금액");

		ImageIcon icon0 = new ImageIcon("image.png");
		ImageIcon icon1 = new ImageIcon("jjam.png");
		ImageIcon icon2 = new ImageIcon("woo.png");
		ImageIcon icon3 = new ImageIcon("jajang.png");

		imgLabel.setIcon(icon0);

		// 폰트
		Font font = new Font("D2Coding", Font.BOLD, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		topLabel.setFont(font);
		countLabel.setFont(font);
		priceLabel.setFont(font);

		// 색
		f.getContentPane().setBackground(Color.green);
		b1.setBackground(Color.magenta);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.cyan);
		countLabel.setBackground(Color.yellow);
		countLabel.setForeground(Color.blue);
		priceLabel.setBackground(Color.green);
		priceLabel.setForeground(Color.red);

		// 끼워넣기
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(topLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(priceLabel);

		// 버튼 기능
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jjamCount++;
				int totalCount = jjamCount + wooCount + jajangCount;
				int totalPrice = (jjamCount * JJAMPRICE) + (wooCount * WOOPRICE) + (jajangCount * JAJANGPRICE);

				imgLabel.setIcon(icon1);
				// 타이틀
				f.setTitle("짬뽕 : " + jjamCount + "개 " + "우동 : " + wooCount + "개 " + "짜장면 : " + jajangCount + "개");
				// 갯수 카운트
				countLabel.setText(String.valueOf(totalCount) + "개");
				// 결제 금액
				priceLabel.setText("결제 금액: " + String.valueOf(totalPrice) + "원");
			}
		});// b1 add end

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wooCount++;
				int totalCount = jjamCount + wooCount + jajangCount;
				int totalPrice = (jjamCount * JJAMPRICE) + (wooCount * WOOPRICE) + (jajangCount * JAJANGPRICE);
				imgLabel.setIcon(icon2);
				// 타이틀
				f.setTitle("짬뽕 : " + jjamCount + "개 " + "우동 : " + wooCount + "개 " + "짜장면 : " + jajangCount + "개");
				// 갯수 카운트
				countLabel.setText(String.valueOf(totalCount) + "개");
				priceLabel.setText("결제 금액: " + String.valueOf(totalPrice) + "원");
			}
		});// b2 add end

		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jajangCount++;
				int totalCount = jjamCount + wooCount + jajangCount;
				int totalPrice = (jjamCount * JJAMPRICE) + (wooCount * WOOPRICE) + (jajangCount * JAJANGPRICE);
				imgLabel.setIcon(icon3);
				// 타이틀
				f.setTitle("짬뽕 : " + jjamCount + "개 " + "우동 : " + wooCount + "개 " + "짜장면 : " + jajangCount + "개");
				// 갯수 카운트
				countLabel.setText(String.valueOf(totalCount) + "개");
				priceLabel.setText("결제 금액: " + String.valueOf(totalPrice) + "원");
			}
		});// b3 add end

		f.setVisible(true);

	}

}
