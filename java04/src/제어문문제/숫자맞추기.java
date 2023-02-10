package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int target = r.nextInt(100) + 1; // 범위설정 1~100
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int count = 0;
		while (true) {
			System.out.print("숫자를 입력하세요.(1~100)");
			input = sc.nextInt();
			if (input == target) {
				System.out.println("정답! 프로그램을 종료합니다.");
				count = count + 1;
				System.out.println("시도 횟수 : " + count);
				break;
			} else if (input < target) {
				System.out.println("땡! 너무 작아요. 다시 시도해주세요.");
				count = count + 1;
			} else {
				System.out.println("땡! 너무 커요. 다시 시도해주세요.");
				count = count + 1;
			}
		}

		sc.close();
	}

}
