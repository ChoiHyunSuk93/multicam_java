package 조건문;

public class If문5 {

	public static void main(String[] args) {

		String ssn = "2055110"; // 주민번호 뒷자리

		if (ssn.equals("2055110")) { // String 비교는 equals 함수 사용해야 함.
			System.out.println("동일한 지역에서 태어나셨군요?");
		} else {
			System.out.println("다른 지역에서 태어나셨군요?");
		}

		char gender = ssn.charAt(0); // 첫번째 자리에 있는 문자 하나 추출

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;

		}
	}

}
