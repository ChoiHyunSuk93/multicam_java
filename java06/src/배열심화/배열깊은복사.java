package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num3 = { 100, 200, 300 };
//		int[] num4 = num3; // 참조형의 복사(얇은 복사) - 원본의 값이 나중에 바뀌면 바뀐대로 복사
		int[] num4 = num3.clone(); // 참조형의 복사(깊은 복사) - 원본의 값이 나중에 바뀌어도 원래 값으로 복사

		num3[0] = 999;

		for (int x : num3) {
			System.out.print(x + " ");
		}
		System.out.println();

		for (int x : num4) {
			System.out.print(x + " ");
		}
		System.out.println();

	}
}
