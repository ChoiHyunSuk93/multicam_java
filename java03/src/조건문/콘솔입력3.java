package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1번 문제
		System.out.println("--1번 문제--");
		System.out.print("아이디를 입력하세요. ");
		String id = sc.next();
		System.out.print("패스워드를 입력하세요. ");
		String pw = sc.next();
		System.out.println("---------------");
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		System.out.println();
		// 2번 문제
		System.out.println("--2번 문제--");
		System.out.print("사과 구매 갯수를 입력해주세요. ");
		int appleCount = sc.nextInt();
		System.out.print("사과 한 개당 가격을 입력해주세요. ");
		int applePrice = sc.nextInt();
		System.out.print("딸기 구매 갯수를 입력해주세요. ");
		int sbCount = sc.nextInt();
		System.out.print("딸기 한 개당 가격을 입력해주세요. ");
		int sbPrice = sc.nextInt();
		int appleTotal = appleCount * applePrice;
		int sbTotal = sbCount * sbPrice;
		int totalPrice = appleTotal + sbTotal;
		System.out.println("---------------");
		System.out.println("사과 구매 가격은 " + appleTotal + "원 입니다.");
		System.out.println("딸기 구매 가격은 " + sbTotal + "원 입니다.");
		System.out.println("전체 구매 가격은 " + totalPrice + "원 입니다.");
		System.out.println();

		// 3번 문제
		System.out.println("--3번 문제--");
		System.out.print("시작값을 입력해주세요(숫자)");
		int start = sc.nextInt();
		System.out.print("종료값을 입력해주세요(숫자)");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("시작값부터 종료값까지 모두 더한 값은 " + sum);
		System.out.println();

		// 4번 문제
		System.out.println("--4번 문제--");
		System.out.print("시작값을 입력해 주세요. ");
		int start2 = sc.nextInt();
		System.out.print("종료값을 입력해 주세요. ");
		int end2 = sc.nextInt();
		System.out.print("점프값을 입력해 주세요. ");
		int jump = sc.nextInt();
		int sum2 = 0;
		for (int i = start2; i <= end2; i = i + jump) {
			sum2 = sum2 + i;
			if (sum2 > 100) {
				break;
			}
		}
		System.out.println("더한 값은 " + sum2);

		sc.close();

	}

}