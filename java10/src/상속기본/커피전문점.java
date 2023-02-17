package 상속기본;

public class 커피전문점 {

	public static void main(String[] args) {
		
		매니저 m1 = new 매니저();
		m1.name = "홍길동";
		m1.address = "강남";
		m1.rrn = "930926";
		m1.salary = 100;
		m1.bonus = 50;
		m1.test();
		System.out.println(m1);

	}

}
