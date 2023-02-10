package 배열;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1. int 크기 5인 배열 생성
		int[] x = new int[5];
		// 2. 배열 크기 프린트
		System.out.println("x배열의 크기 : " + x.length);
		// 3. 배열의 첫번째 위치에 100을 넣어서 프린트
		x[0] = 100;
		System.out.println("첫번째 위치값: " + x[0]);
		// 4. 배열의 마지막 위치에 500을 넣어서 프린트
		x[4] = 500;
		System.out.println("마지막 위치값: " + x[4]);
		// 5. 배열의 세번째 위치에 200을 넣어서 프린트
		x[2] = 200;
		System.out.println("세번째 위치값: " + x[2]);
		// 6. 배열의 전체 데이터 프린트
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		for (int i = 0; i < x.length; i++) {
			System.out.println("인덱스 : " + i + " 값 : " + x[i] + " ");
		}

	}
}
