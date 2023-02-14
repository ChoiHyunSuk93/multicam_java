package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String s = "    011-245-1234  ";
		// 1. 양쪽 공백을 제거
		// 2. -을 기준으로 분리(String[])
		// 3. 첫번째 문자열이 011이면 Sk, 019이면 LG, 나머지이면 Apple
		// 4. 두번째 문자열의; 길이가 4개이상이면 최신폰, 아니면 옲드폰
		// 5. 전체 전화번호의 길이가 10글자 이상이면 유효, 아니면 유효X

		// 1.
		String s1 = s.trim();
		System.out.println(s1);
		// 2.
		String[] s2 = s1.split("-");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		// 3.
		if (s2[0].equals("011")) {
			System.out.println("SK");
		} else if (s2[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		// 4.
		if (s2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		// 5.
		if (s2[0].length() + s2[1].length() + s2[2].length() >= 10) {
			System.out.println("유효");
		} else {
			System.out.println("유효하지 않음");
		}
		// 5번-for문 이용
		int total = 0;
		for (int i = 0; i < s2.length; i++) {
			total += s2[i].length();
		}
		System.out.println(total);
		if (total >= 10) {
			System.out.println("유효");
		} else {
			System.out.println("유효하지 않음");
		}
	}

}
