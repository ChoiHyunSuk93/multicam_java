package 마무리문제;

public class CoffeTruck extends Truck {

	final static int PRICE = 3000; // 커피 가격
	static int count; // 커피 판매 잔수

	public void trunk() {
		System.out.println("커피 재료를 싣습니다.");
	}
	
	
	public void coffee() {
		System.out.println("커피를 팝니다.");
		count++;
	}

}
