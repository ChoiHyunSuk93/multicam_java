package 인터페이스;

public class 컴퓨터사용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Computer com = new Computer();
//		인터페이스는 불안정해서 이것을 틀로 해서 객체생성 불가능!
		Computer com = new Computer() {
			
			@Override
			public void 프로그램가동하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 부팅하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 계산하다() {
				// TODO Auto-generated method stub
				
			}
		};
		
		// Computer인터페이스를 구체적으로 구현한 이르없는 클래스를 가지고 객체생성함.
		// -> 익명클래스!
		
	}

}
