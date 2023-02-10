package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// 1~10번까지 데이터 중에서 짝수만 프린트!

		for (int i = 1; i <= 10; i++) {
			// i가 8이 되면 for문 종료!
			if (i == 8) {
				break;
//				System.exit(0);
			}
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("휴~for문 다 끝났다");
		
		

	}

}
