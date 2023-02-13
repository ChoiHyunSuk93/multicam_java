package 배열심화;

public class 깊은복사확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subject = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] point1 = {44, 66, 22, 99, 100};
		// 배열의 깊은복사 응용
		int[] point2 = point1.clone();
		point2[0] = 22;
		point2[2] = 88;
		
		// 0. 전체 1학기, 2학기 성적 프린트
		for (int i = 0; i < point2.length; i++) {
			System.out.print(point1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < point2.length; i++) {
			System.out.print(point2[i] + " ");
		}
		System.out.println();
		
		// 1. 1학기, 2학기 성적 중 동일한 성적 과목수
		int sameCount = 0;
		int upCount = 0;
		for (int i = 0; i < point2.length; i++) {
			if (point1[i] == point2[i]) {
				sameCount++;
			} else if (point1[i] < point2[i]) {
				upCount++;
				System.out.println("\n성적이 오른 과목은 " + subject[i]);
			}
		}
		System.out.println("동일한 성적 과목수: " + sameCount);
		
		// 2. 1학기, 2학기 성적 중 오른 과목수
		
		System.out.println("성적이 오른 과목수: " + upCount);
		
		// 3. 1학기, 2학기 성적 중 오른 과목명
		
		
	}

}
