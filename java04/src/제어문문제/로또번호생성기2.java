package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(); // ()안에 숫자를 넣어주면 값 고정. 씨앗값, seed값
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(45) + 1)); // 1~45
		}
		System.out.println();
		
		// 2~10
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(9) + 2));
		}
		System.out.println();

		// 3~30
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(28) + 3));
		}
	}

}
