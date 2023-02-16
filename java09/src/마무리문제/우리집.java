package 마무리문제;

public class 우리집 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		딸 d1 = new 딸("홍길순", '여');
		딸 d2 = new 딸("홍길진", '여');

		// 딸들의 정보 출력
		System.out.println(d1);
		System.out.println(d2);
		// 딸이 몇명인지 카운트한 것 프린트
		System.out.println("딸은 " + 딸.count + "명 입니다.");
		// 현재 남은 아빠 지갑에 들어있는 돈 프린트
		System.out.println("현재 아빠 지갑에는 " + 딸.wallet + "원 남아있습니다.");

		d1.tv보다();
		d2.tv보다();

	}

}
