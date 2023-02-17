package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		볼펜 pen1 = new 볼펜();
		
		pen1.company = "모나미";
		pen1.thickness = 1;
		pen1.price = 1000;
		
		System.out.println(pen1);
		pen1.사다();
		pen1.글을쓰다();
	}

}
