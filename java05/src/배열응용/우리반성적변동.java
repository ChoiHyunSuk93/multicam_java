package 배열응용;

public class 우리반성적변동 {

	public static void main(String[] args) {
		// 여러개의 배열을 사용하고 싶은 경우 같은 인덱스 사용.

		int[] n1 = { 44, 66, 77, 22, 11 }; // 1학기 성적
		int[] n2 = { 33, 55, 77, 22, 40 }; // 2학기 성적
		int sameCount = 0; // 동일한 갯수 누적
		int notsameCount = 0; // 동일하지 않은 갯수 누적

		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				sameCount++;
			} else {
				notsameCount++;
			}
		}
		System.out.println("성적이 동일한 학생 수: " + sameCount + "명");
		System.out.println("성적이 동일하지 않은 학생 수: " + notsameCount + "명");

	}

}
