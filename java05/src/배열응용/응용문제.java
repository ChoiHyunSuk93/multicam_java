package 배열응용;

import java.util.Scanner;

public class 응용문제 {

	public static void main(String[] args) {
		// Scanner 사용
		// 1. 정수 5개 크기의 배열을 만들어서 10, 20, 30, 40 ,50 순서대로 넣는다.
		// 첫번째값과 세번째값을 더해서 프린트
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print("숫자를 입력하세요 >> ");
			a[i] = sc.nextInt();
		}
		int result = a[0] + a[2];
		System.out.println("첫번째 값과 세번째 값의 합: " + result);

		// 2. 스트링 3개 크기의 배열을 만들어서 자바, 스프링, JSP를 순서대로 넣는다.
		// ==> "자바 보다는 스프링"로 출력
		String[] b = new String[3];
		for (int i = 0; i < b.length; i++) {
			System.out.print("프로그램 언어를 입력하세요 >> ");
			b[i] = sc.next();
		}
		String result2 = b[0] + " 보다는 " + b[1];
		System.out.println(result2);

		sc.close();
	}

}
