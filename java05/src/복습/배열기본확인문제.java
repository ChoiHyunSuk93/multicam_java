package 복습;


public class 배열기본확인문제 {

	public static void main(String[] args) {
		
		// 다음의 데이터를 다룰 수 있는 배열을 만들어 임의의 데이터를 넣은 후, 프린트
		// 1. 좋아하는 여행지 5개
		String[] travel = {"베네치아", "몰타", "이집트", "일본", "파리"};
		for (String t : travel) {
			System.out.println(t);
		}
		
		// 2. 좋아하는 색깔 5개의 첫 글자
		char[] color = {'b', 'w', 'g', 'b', 'l'};
		for (char c : color) {
			System.out.println(c);
		}
		
		// 3. 좋아하는 연예인 5명의 키
		double[] celb = {170.5, 165.3, 158.5, 170.4, 181.6};
		for (double d : celb) {
			System.out.println(d);
		}
		

	}

}
