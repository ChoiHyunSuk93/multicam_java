package 마무리문제;

public class 내차들 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoffeTruck t1 = new CoffeTruck();
		CoffeTruck t2 = new CoffeTruck();
		System.out.println("바퀴 갯수는 " + t1.wheel + "개");
		System.out.println("트럭 색깔은 " + t1.color);
		t1.drive();
		t1.trunk();

		for (int i = 0; i < 10; i++) {
			t1.coffee();
		}

		for (int i = 0; i < 5; i++) {
			t2.coffee();
		}

		int total = CoffeTruck.count * CoffeTruck.PRICE;

		System.out.println("커피 판매 갯수는? : " + CoffeTruck.count + "잔");
		System.out.println("오늘 총 수익은? : " + total + "원");

	}

}
