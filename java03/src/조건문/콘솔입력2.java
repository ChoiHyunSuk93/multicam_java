package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("나의 이름은? ");
		String name = sc.next();

		System.out.print("나의 나이는? ");
		int age = sc.nextInt();
		age = age + 1;

		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		height = height + 11;

		System.out.print("나의 몸무게는? ");
		double weight = sc.nextDouble();
		weight = weight - 10;

		System.out.print("나는 저녁을 먹었나요? (true/false) ");
		boolean dinner = sc.nextBoolean();
		String ans = "";
		if (dinner == true) {
			ans = "먹었습니다.";
		} else if (dinner == false) {
			ans = "먹지 않았습니다.";
		}

		System.out.print("나의 좌우명은? ");
		sc.nextLine();
		String motto = sc.nextLine();
		System.out.println("-------------");

		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 나이는 " + age + "세 입니다.");
		System.out.println("내 내년 키는 " + height + "입니다.");
		System.out.println("내 내년 몸무게는 " + weight + "입니다.");
		System.out.println("나는 저녁을 " + ans);
		System.out.println("나의 좌우명은 " + motto + "입니다.");

		sc.close();

	}

}