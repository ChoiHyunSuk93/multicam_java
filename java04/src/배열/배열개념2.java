package 배열;

public class 배열개념2 {

	public static void main(String[] args) {
		// 1. 배열에 일주일 간 공부한 시간을 저장해보세요.
		// {1, 2, 3, 4, 5, 6, 7}, 배열이름 - week
		int[] week = { 1, 2, 3, 4, 5, 6, 7 };

		// 2. 첫번째 위치와 두번째 위치값을 프린트
		System.out.println("week배열 첫 번째 위치값 : " + week[0]); // 첫번째 값
		System.out.println("week배열 두 번째 위치값 : " + week[1]); // 두번째 값

		// 3. week배열에 들어있는 데이터 수를 프린트
		System.out.println("week배열에 들어 있는 데이터 수 : " + week.length);

		// 4. 세번째 위치값을 10으로, 다섯번째 위치값을 12로 넣어주세요.
		week[2] = 10;
		week[4] = 12;

		// 5. 다섯번째 위치값을 프린트
		System.out.println("week배열 다섯 번째 위치값 : " + week[5]);

		// 6. 배열을 처음에 만들 때 값을 모름. 크기는 4개
		// 저장공간을 일단 만들어 두자. 배열이름 tour
		int[] tour = new int[4];

		// 7. 첫번째 인덱스에 20, 세번째 위치에 30을 넣고나서 프린트
		tour[0] = 20;
		tour[2] = 30;
		System.out.println("tour배열 첫 번째 위치값 : " + tour[0]);
		System.out.println("tour배열 세 번째 위치값 : " + tour[2]);

		// 8. tour변수의 갯수를 프린트
		System.out.println("tour변수의 갯수 : " + tour.length);

	}

}
