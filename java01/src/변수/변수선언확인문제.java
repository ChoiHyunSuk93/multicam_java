package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// 내 정보중 기본 데이터에 속하는 정보를 변수에 넣고, 출력해보세요!
//		정수
		int age = 31;
//		실수
		double height = 174.5;
//		문자1
		char gender = 'm';
//		논리
		boolean food = false;
//		이름. 여러글자를 쓸 때는 "".
//		기본데이터X. 하지만, 너무 많이 쓰기 때문에 기본형처럼 사용 가능. 문자열
		String name = "최현석";
//		출력
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 키는 " + height);
		System.out.println("나의 성별은 " + gender);
		System.out.println("나의 아침은 " + food);
	}

}
