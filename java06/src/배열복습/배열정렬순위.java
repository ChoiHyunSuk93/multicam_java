package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1; // 1~1000
		}
		// 전체출력
		for (int x : jumsu) {
			System.out.println(x);
		}
		// 정렬(sort): 오름차순(작-->큰(오름차순), 큰-->작(내림차순))
		System.out.println("---------------------------");
		Arrays.sort(jumsu);
		// sort(jumsu) --> jumsu가 바뀌어버림(원본이 파괴)

		// 정렬 후, 확인
		for (int x : jumsu) {
			System.out.println(x);
		}

		// 정렬후, 최대값, 최소값을 프린트!
		System.out.println("최소값: " + jumsu[0]);
		System.out.println("최대값: " + jumsu[jumsu.length - 1]);

		// 상위 30%-> 인원3000명, 높은 점수부터 3000개 추출
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 += jumsu[i];
		}
		System.out.println("상위 30%평균: " + sum30 / 3000.0);

		// 하위 30%의 평균
		int sumDown30 = 0;
		for (int i = 0; i < 3000; i++) {
			sumDown30 += jumsu[i];
		}
		System.out.println("하위 30%평균: " + sumDown30 / 3000.0);
		String result = Arrays.toString(jumsu); // int배열을 String으로 변환
		System.out.println(result);

	}

}
