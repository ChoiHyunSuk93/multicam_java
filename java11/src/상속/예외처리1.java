package 상속;

public class 예외처리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 나는 프린트 될 거야");
		try {
			System.out.println("2. 문제 발생 코드>> " + 10 / 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("관리자에게 메일을 보내는 처리..");
		}
		System.out.println("3. 나는 과연 프린트 될까요?");
	}

}
