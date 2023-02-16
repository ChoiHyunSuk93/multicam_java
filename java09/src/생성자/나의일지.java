package 생성자;

public class 나의일지 {

	public static void main(String[] args) {

		// count, sum
		Day day1 = new Day("자바공부", 8, "집");
		System.out.println(Day.count); // static 변수를 쓸 때는 클래스 이름을 바로 씀
		System.out.println(Day.sum);
		Day day2 = new Day("검도", 1, "체육관");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("시험요약정리", 2, "집");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		// 총 12개 다이나믹 생성, 멤버변수 -> 객체생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		// 인스턴스 변수라고 부른다.
		
	}
}
