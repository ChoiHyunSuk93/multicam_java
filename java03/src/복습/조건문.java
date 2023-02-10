package 복습;


public class 조건문 {

	public static void main(String[] args) {
		int target = 77; // 숫자 맞추기를 해봅시다.
		int me = 88; // 내가 시도한 값

		if (me == target) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}

		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답입니다.");
			break;
		case "신나":
		case "놀자":
		case "나가자":
			System.out.println("오답입니다.");
			break;
		default:
			System.out.println("그만해.");
			break;
		}

	}

}
