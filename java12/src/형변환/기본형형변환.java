package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 = 100; // 1바이트, -128~127
		int i1 = 200; // 4바이트, -21억~21억

		i1 = b1; // 큰 <- 작, 자동으로 형변환(자동형변환)

		b1 = (byte) i1; // 작 <- 큰, 강제로 형변환(강제형변환)

		double d1 = i1; // 자동형변환
		i1 = (int) d1; // 강제형변환
		
		int i2 = 200;
		byte b2 = (byte) i2; // byte범위를 넘어가는 int값은 강제형변환 하면 안됌
		System.out.println(b2);
		
		
	}

}
