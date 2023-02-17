package 마무리문제;

public class CountDownThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 60; i > 0; i--) {
			System.out.println("카운트다운 : " + i + "초");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("CPU 연결 문제 발생");
			}
		}
		
	}
}
