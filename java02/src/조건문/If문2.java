package 조건문;

public class If문2 {

	public static void main(String[] args) {
		// 1번 문제
		// x와 y가 같은지 비교, 같으면 "동일합니다" 아니면 "동일하지 않아요" 프린트
		int x = 0;
		int y = 0;
		if (x == y) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않아요.");
		}

		// 2번 문제
		int id = 1111;
		int id2 = 2222;

		if (id == id2) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

}
