package 배열응용;

import java.util.Random;

public class 수능점수 {

	public static void main(String[] args) {
		int[] point = new int[10000];
		Random r = new Random(42); // 범위 0~450
		int count1 = 0; // 만점자 수
		int count2 = 0; // 0점자 수
		int sum = 0; // 점수총합

		for (int i = 0; i < point.length; i++) {
			point[i] = r.nextInt(451);
			if (point[i] == 450) {
				count1++;
			} else if (point[i] == 0) {
				count2++;
			} // if
			sum += point[i];
		} // for
			// 1. 만점자 몇명?
		System.out.println("만점자 수: " + count1);
		// 1-1. 만점자인덱스?
		for (int i = 0; i < point.length; i++) {
			if (point[i] == 450) {
				System.out.println("만점자 인덱스: " + i);
			}
		}
		// 2. 0점 몇명?
		System.out.println("0점 수: " + count2);
		// 3. 평균?
		double avg = (double) sum / point.length;
		System.out.println("평균 : " + avg);
		// 4. 평균보다 +-50점인 학생 카운트
		int count3 = 0; // 평균+-50점인 학생 수
		for (int i = 0; i < point.length; i++) {
			if ((point[i] >= avg - 50) && (point[i] <= avg + 50)) {
				count3++;
			} // if
		} // for
		System.out.println("평균보다 +-50점인 학생 수: " + count3);
		
		// 5. 상위30% 학생들의  수, 점수의 평균 ???
		
		
		
		
	}

}
