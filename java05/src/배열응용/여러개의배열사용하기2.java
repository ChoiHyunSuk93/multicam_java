package 배열응용;

public class 여러개의배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 2학기 성적 오른 학생 몇명?
		// 2. 1,2학기 성적 동일학생 몇명?
		// 3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
		// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		// 5. 심화)뉴진스의 1학기 성적, 2학기 성적은?

		int upCount = 0; // 성적이 오른 학생
		int sameCount = 0; // 성적 동일학생
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				upCount++;
			} else if (term1[i] == term2[i]) {
				sameCount++;
			} // if-else if
		} // for

		// 1번 출력
		System.out.println("2학기 성적이 오른 학생은 " + upCount + "명");

		// 2번 출력
		System.out.println("1,2학기 성적이 동일한 학생은 " + sameCount + "명");

		// 3번 출력
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 성적이 만점인 학생은 " + names[i] + ", 번호(인서트)는 " + i + "번");
			} // if
		} // for
		int sum1 = 0; // 1학기 성적 총합
		int sum2 = 0; // 2학기 성적 총합
		for (int i = 0; i < term2.length; i++) {
			sum1 += term1[i];
			sum2 += term2[i];
		}
		double avg1 = (double) sum1 / term1.length; // 1학기 성적 평균
		double avg2 = (double) sum2 / term2.length; // 2학기 성적 평균

		// 4번 출력
		if (avg1 > avg2) {
			System.out.println("1학기 성적 평균이 더 높았습니다.");
		} else if (avg1 < avg2) {
			System.out.println("2학기 성적 평균이 더 높았습니다.");
		} else {
			System.out.println("1,2학기 성적 평균이 같습니다.");
		}

		// 5번 출력
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 1학기 성적: " + term1[i] + "점 / 2학기 성적: " + term2[i] + "점");
			} // if
		} // for
	}
}
