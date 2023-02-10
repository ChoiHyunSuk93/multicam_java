package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10];
		x[0] = 10;
		x[1] = 20;
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();

		// 우리가족의 성별을 char[]로 저장, 프린트
		char[] familyGender = { '남', '여', '남', '여' };
		for (int i = 0; i < familyGender.length; i++) {
			System.out.print(familyGender[i] + " ");
		}
		System.out.println();

		// 우리가족의 이름을 String[]으로 저장, 프린트
		String[] familyName = { "최종민", "박혜란", "최현석", "최윤하" };
		for (int i = 0; i < familyName.length; i++) {
			System.out.print(familyName[i] + " ");
		}
		System.out.println();

		// 우리가족의 시력을 double[]로 저장, 프린트
		double[] familyEye = { 1.0, 0.5, 0.9, 0.6 };
		for (int i = 0; i < familyEye.length; i++) {
			System.out.print(familyEye[i] + " ");
		}
		System.out.println();

		// 우리가족이 점심을 먹었는지 boolean[]로 저장, 프린트
		boolean[] familyLunch = { true, true, true, true };
		for (int i = 0; i < familyLunch.length; i++) {
			System.out.print(familyLunch[i] + " ");
		}
	}

}
