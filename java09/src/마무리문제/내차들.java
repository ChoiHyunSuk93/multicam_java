package 마무리문제;

public class 내차들 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoffeTruck t1 = new CoffeTruck();
		t1.color = "빨간색";
		System.out.println("트럭 색깔은 " + t1.color);
		t1.weight = 1500;
		System.out.println("트럭 무게는 " + t1.weight);
		t1.drive();
		t1.trunk();

		for (int i = 0; i < 10; i++) {
			t1.coffee();
		}


		int total = CoffeTruck.count * CoffeTruck.PRICE;

		System.out.println("커피 판매 갯수는? : " + CoffeTruck.count + "잔");
		System.out.println("오늘 총 수익은? : " + total + "원");

	}

}
