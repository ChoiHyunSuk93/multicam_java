package 조건문;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
//		1~2번 equals()사용
//		1. 암호를 대시오 입력 -> pass라고 입력
//		암호가 맞으면 "들어오세요." 프린트
//		암호가 틀리면 "나가세요" 프린트

		String pw = JOptionPane.showInputDialog("암호를 대시오");
		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}

//		2. 당신이 먹고 싶은 저녁메뉴는(자장면, 라면, 회)에서 선택
//		자장면이면 "중국집으로 가요"
//		라면이면 "분식집으로 가요"
//		회이면 "횟집으로 가요"
//		위에 없으면 "그냥 안먹어요"

		String menu = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁메뉴는?(자장면, 라면, 회)");
		switch (menu) {
		case "자장면":
			System.out.println("중국집으로 가요.");
			break;
		case "라면":
			System.out.println("분식집으로 가요.");
			break;
		case "회":
			System.out.println("횟집으로 가요.");
			break;

		default:
			System.out.println("그냥 안먹어요.");
			break;
		}

//		3. JOptionPane을 사용
//		두 정수를 입력받으세요 --> 누가 더 큰지 출력!

		String data1 = JOptionPane.showInputDialog("정수를 입력하세요-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하세요-2");
		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2);
		if (x > y) {
			System.out.println(x);
		} else if (x < y) {
			System.out.println(y);
		} else {
			System.out.println("두 정수의 값은 같습니다.");
		}

//		4. 사원번호--> String no = "A100EX";
//		맨 앞에 있는 글자를 추출 no.charAt(0)을 이용
//		A이면 기획부 프린트, B이면 총무부 프린트, C이면 개발부 프린트, 아니면 해당부서없음 프린트

		String no = "A100EX";
		char department = no.charAt(0);
		switch (department) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;

		default:
			System.out.println("해당부서 없음");
			break;
		}
	}

}
