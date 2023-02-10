package 배열기본;

import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu = new int[999];

		for (int x : jumsu) {
			System.out.println(x);
		}
		System.out.println("----------------------");

		Random r = new Random();
//		int data = r.nextInt(4) + 1; // 1~4번 중 랜덤

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(4) + 1;
		}
		for (int y : jumsu) {
			System.out.println(y);
		}
	}

}
