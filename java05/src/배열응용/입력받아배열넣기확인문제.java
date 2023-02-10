package 배열응용;

import java.util.Scanner;

public class 입력받아배열넣기확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lastYear = new String[3]; // 작년에 가고 싶었던 곳 배열
		String[] thisYear = new String[3]; // 올해 가고 싶었던 곳 배열

		for (int i = 0; i < thisYear.length; i++) {
			System.out.print("작년에 가고 싶었던 곳을 입력하세요-" + (i + 1) + "순위 >>");
			lastYear[i] = sc.next();

		}
		for (int i = 0; i < thisYear.length; i++) {
			System.out.print("올해 가고 싶었던 곳을 입력하세요-" + (i + 1) + "순위 >>");
			thisYear[i] = sc.next();
		}

		int count = 0; // 작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳의 수
		for (int i = 0; i < thisYear.length; i++) {
			if (lastYear[i].equals(thisYear[i])) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳의 수 : " + count + "곳");

		sc.close();
	}
}
