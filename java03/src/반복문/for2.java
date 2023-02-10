package 반복문;

import javax.swing.JOptionPane;

public class for2 {

	public static void main(String[] args) {

		for (;;) { // 무한 루프(반복)
			System.out.println("잘 쓰지 않음");
			String data = JOptionPane.showInputDialog("종료할까요? y를 입력");
			// == 연산자는 기본데이터만 비교 가능
			if (data.equals("y")) {
				System.out.println("안녕히 가세요!");
				break; // for문의 break
			}
		}

	}

}
