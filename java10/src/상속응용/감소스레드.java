package 상속응용;

public class 감소스레드 extends Thread {

	// 동시에 실행할 내용을 run() 메서드 안에 넣어주기
	@Override
	public void run() {
		for (int i = 500000; i > 0; i--) {
			System.out.println("감소>> " + i);
		}

	}
}
