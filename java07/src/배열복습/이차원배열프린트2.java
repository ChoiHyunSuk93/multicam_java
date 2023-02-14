package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		// 꼭 하고 싶은 것 9가지 작성해서, 전체 프린트
		String[][] s = {
				{"여행","취업","게임"},
				{"영화","데이트","마사지"},
				{"피부관리","맛집탐방","운동"}
		};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
