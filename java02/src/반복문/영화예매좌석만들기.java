package 반복문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매좌석만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000,500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//100번 반복
		for (int i = 0; i < 100; i++) {
			JButton b1 = new JButton("나는 버튼");
			f.add(b1);
		}
		
		
		// 마지막
		f.setVisible(true);
	}

}
