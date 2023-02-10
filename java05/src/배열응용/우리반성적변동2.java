package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		// 여러개의 배열을 사용하고 싶은 경우 같은 인덱스 사용.
		// 0~100점까지
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];
		int sameCount = 0; // 동일한 갯수 누적
		int notsameCount = 0; // 동일하지 않은 갯수 누적
		int upcount = 0; // 성적이 오른 사람
		int downcount = 0; // 성적이 내린 사람
		
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
			if (n1[i] == n2[i]) {
				sameCount++;
			} else { // 같지 않은 경우
				notsameCount++;
				if (n1[i] < n2[i]) { // 2학기에 성적이 더 오른 학생
					upcount++;
					System.out.println("2학기에 성적이 오른 학생은: " + i);
				} else { // 1학기에 성적이 더 오른 학생
					downcount++;
					System.out.println("2학기에 성적이 내린 학생은: " + i);
				}
			}
		}
		System.out.println("성적이 동일한 학생 수: " + sameCount + "명");
		System.out.println("성적이 동일하지 않은 학생 수: " + notsameCount + "명");
		// 2학기에 성적이 더 오른 학생은 몇명? 누구?
		// 1학기 성적이 더 좋았던 학생은 몇명? 누구?

		System.out.println("성적이 오른 학생: " + upcount + "명");
		System.out.println("성적이 내린 학생: " + downcount + "명");

	}

}
