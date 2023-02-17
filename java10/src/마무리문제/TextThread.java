package 마무리문제;

public class TextThread extends Thread {
	@Override
	public void run() {
		String[] text = { "시험종료 1분 남았습니다.", 
					      "시험종료 30초 남았습니다.", 
						  "시험이 종료되었습니다." };
		for (int i = 0; i < 3; i++) {
			System.out.println(text[i]);
			try {
				Thread.sleep(30000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("CPU 연결 문제 발생");
			}
		}
	}
}
