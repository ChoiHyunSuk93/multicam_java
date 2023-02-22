package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 부팅하다() {
		// TODO Auto-generated method stub
		System.out.println("빠르게 켜진다.");
	}

	@Override
	public void 계산하다() {
		// TODO Auto-generated method stub
		System.out.println("코드를 분석해서 계산한다.");
	}

	@Override
	public void 프로그램가동하다() {
		// TODO Auto-generated method stub
		System.out.println("이클립스를 실행한다.");
	}

}
