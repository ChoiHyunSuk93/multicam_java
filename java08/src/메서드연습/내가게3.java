package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전에 온 손님 수
		int count2 = 4; // 오후에 온 손님 수

		// 계산기3 이용
		// 1. 전체 손님 수를 반환받아서 다음과 같이 프린트
		// 오늘 온 손님의 총 합은 9명 입니다.
		int totalCount = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + totalCount + "명 입니다.");

		// 2. 오전과 오후 손님수 차이는?
		// 손님 수 차이는 1명 입니다.
		int dif = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + Math.abs(dif) + "명 입니다."); // 절대값
		// 수학과 관련된 함수
		System.out.println(Math.PI);
		System.out.println(Math.ceil(3.334)); // 올림
		System.out.println(Math.floor(3.334)); // 내림
		System.out.println(Math.round(3.334)); // 반올림
		System.out.println(Math.round(3.634)); // 반올림
		System.out.println(Math.sqrt(100)); // 루트
		System.out.println(Math.max(100, 200));
		System.out.println(Math.min(100, 200));
		System.out.println(Math.pow(2, 3)); // 2의 3승

		// 3. 오전에 들어온 손님의 결제 금액은?
		// 오전 결제 금액은 35000원 입니다.
		int amPrice = cal3.mul(price, count1);
		System.out.println("오전 결제 금액은 " + amPrice + "원 입니다.");

		// 4. 오후에 들어온 손님의 결제 금액은?
		// 오후 결제 금액은 28000원 입니다.
		int pmPrice = cal3.mul(price, count2);
		System.out.println("오후 결제 금액은 " + pmPrice + "원 입니다.");

		// 5. 오전과 오후에 들어온 손님의 총 결제 금액은?
		int totalPrice = cal3.add(amPrice, pmPrice);
		System.out.println("오늘 하루 총 결제 금액은" + totalPrice + "원 입니다.");

		// 6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산
		int price2 = cal3.div(totalPrice, totalCount);
		System.out.println("1인당 결제금액은 " + price2 + "원 입니다.");

	}

}
