package 상속응용;

import java.util.Date;

public class TimerThread extends Thread {

	@Override
	public void run() {
		
		for (int i = 1000; i > 0; i--) {
			Date date = new Date();
			System.out.println("타이머 >>" + date);
			try {
				Thread.sleep(1000); // 1초 재워라
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("cpu 연결 문제 생김");
			}
		}
	}
}
