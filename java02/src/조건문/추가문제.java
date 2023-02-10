package 조건문;

import javax.swing.JOptionPane;

public class 추가문제 {

	public static void main(String[] args) {
//		1. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
//		2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!

//		1번문제

		// 입력
		String data1 = JOptionPane.showInputDialog("숫자를 입력하세요-1");
		String data2 = JOptionPane.showInputDialog("숫자를 입력하세요-2");
		String math = JOptionPane.showInputDialog("사칙연산자를 입력하세요(+, -, *, /)");

		// 처리 : 데이터 실수 변환
		double num1 = Double.parseDouble(data1);
		double num2 = Double.parseDouble(data2);
		double result = 0;

		switch (math) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;

		default:
			
			break;
		}
		
		// 출력
		System.out.println(result);

//		2번문제

		// 입력
		String data3 = JOptionPane.showInputDialog("숫자를 입력하세요-1");
		String data4 = JOptionPane.showInputDialog("숫자를 입력하세요-2");

		// 처리
		int num3 = Integer.parseInt(data3);
		int num4 = Integer.parseInt(data4);
		double result2 = (double) num3 / num4;
		
		//출력
		System.out.printf("%.2f", result2);

	}

}
