package 상속응용;

public class PC상황표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountThread count = new CountThread();
		TimerThread timer = new TimerThread();
		ImageThread image = new ImageThread();
		
		count.start();
		timer.start();
		image.start();
	}

}
