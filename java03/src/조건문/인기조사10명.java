package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		// 인기투표
		// 1)아이유 2)유재석 3)BTS
		int iu = 0;
		int yjs = 0;
		int bts = 0;
		int invalid = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표 : 1-아이유, 2-유재석, 3-BTS");
			switch (data) {
			case "1":
				iu++;
				break;
			case "2":
				yjs++;
				break;
			case "3":
				bts++;
				break;
			default:
				invalid++;
				break;
			}
		}
		System.out.println("아이유 : " + iu + "표");
		System.out.println("유재석 : " + yjs + "표");
		System.out.println("BTS : " + bts + "표");
		System.out.println("무효표 : " + invalid + "표");

	}

}
