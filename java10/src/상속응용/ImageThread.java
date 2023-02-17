package 상속응용;

public class ImageThread extends Thread {

	@Override
	public void run() {
		String[] images = { "1.png", "2.png", "3.png", "4.png", "5.png", 
				"1.png", "2.png", "3.png", "4.png", "5.png", 
				"1.png", "2.png", "3.png", "4.png", "5.png", 
				"1.png", "2.png", "3.png", "4.png", "5.png"
				};
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[i]);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("cpu 연결 문제 생김.");
			}
		}

	}
}
