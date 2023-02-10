package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서 저장공간에 넣고 싶을 때 => 배열 사용
		int[] jumsu = new int[5];

		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();

		// 1. 전체 합계 구해서 평균 구해보기
		// 2. 300이상 되는 숫자만 찾아서 합계를 구해보기
		// 3. 심화문제, 300이상 되는 위치인 index 프린트

		// 1번 문제
		int sum = 0;

		for (int x : jumsu) {
			sum += x; // sum = sum + x;
		}

		double avg = (double)sum / jumsu.length;

		System.out.println("전체 합계: " + sum);
		System.out.println("전체 합계의 평균: " + avg);

		// 2번 문제
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 += jumsu[i];
			}
		}
		System.out.println("300이상 되는 숫자의 합계: " + sum2);

		// 3번 문제
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.print(i + " ");
			}
		}

	}

}
