package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0; // 입력한 숫자
		int iuCount = 0; // 아이유 투표 수 누적
		int btsCount = 0; // 방탄 투표 수 누적
		int njCount = 0; // 뉴진스 투표 수 누적

		System.out.println("인기투표 시스템");
		System.out.println("1.아이유 2.방탄 3.뉴진스 4.종료");

		while (true) {
			System.out.print("번호를 입력해 주세요 >> ");
			input = sc.nextInt();

			if (input == 4) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("----------------");
				System.out.println("아이유 : " + iuCount + "표");
				System.out.println("방탄 : " + btsCount + "표");
				System.out.println("뉴진스 : " + njCount + "표");
				break;
			} else if (input == 1) {
				iuCount++;
			} else if (input == 2) {
				btsCount++;
			} else if (input == 3) {
				njCount++;
			} else {
				System.out.println("해당 번호가 없습니다.");
			}
		
		}

		sc.close();
	}

}
