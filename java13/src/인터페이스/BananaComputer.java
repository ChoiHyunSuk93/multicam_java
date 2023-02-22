package 인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 부팅하다() {
		// TODO Auto-generated method stub
		System.out.println("천천히 켜진다.");
	}

	@Override
	public void 계산하다() {
		// TODO Auto-generated method stub
		System.out.println("계산기로 연산처리를 한다.");
	}

	@Override
	public void 프로그램가동하다() {
		// TODO Auto-generated method stub
		System.out.println("게임을 실행한다.");
	}

}
