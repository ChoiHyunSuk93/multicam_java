package 상속응용;

// 동시에 실행시키고 싶은 부품은 Thread 클래스 상속
public class 증가스레드 extends Thread {

	// 동시에 실행할 내용을 run() 메서드 안에 넣어주기
	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			System.out.println("증가>> " + i);
		}

	}

}
