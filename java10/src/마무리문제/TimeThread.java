package 마무리문제;

import java.util.Date;

public class TimeThread extends Thread {
	@Override
	public void run() {
		for (int i = 60; i > 0; i--) {
			Date date = new Date();
			System.out.println("Timer : " + date);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("CPU 연결 문제 발생");
			}
		}

	}
}
