package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 두 개의 숫자를 입력을 받아서 처리해서 출력
		String data1 = JOptionPane.showInputDialog("숫자1입력");
		String data2 = JOptionPane.showInputDialog("숫자2입력");
		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2);
		double result = (double) x / y;
		System.out.printf("%.3f", result);

	}

}
