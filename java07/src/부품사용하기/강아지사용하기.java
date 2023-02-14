package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 p1 = new 강아지();
		p1.age = 1;
		p1.name = "바둑이";
		System.out.println("p1의 나이는 " + p1.age + "살");
		System.out.println("p1의 이름은 " + p1.name);
		p1.짖기();

		강아지 p2 = new 강아지();
		p2.age = 5;
		p2.name = "뽀삐";
		System.out.println("p2의 나이는 " + p2.age + "살");
		System.out.println("p2의 이름은 " + p2.name);
		p2.꼬리흔들기();
	}

}
