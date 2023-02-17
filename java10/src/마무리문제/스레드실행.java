package 마무리문제;

public class 스레드실행 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextThread text = new TextThread();
		TimeThread time = new TimeThread();
		CountDownThread count = new CountDownThread();
		
		count.start();
		time.start();
		text.start();
	}

}
