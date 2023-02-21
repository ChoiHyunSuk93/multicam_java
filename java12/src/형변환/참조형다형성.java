package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형다형성 {

	public static void main(String[] args) {
		// 클래스 다형성 == 참조형 다형성
		// 상속!! 관계일 때만 형변환이 가능!

		ArrayList list = new ArrayList();
		// 자동형변환(업캐스팅)
		list.add("홍길동"); // Object <- String
		list.add(100); // Object <- int
		list.add(11.2); // Object <- double
		list.add(new JButton("나는 버튼")); // Object <- JButton

		// 강제형변환(다운캐스팅)
		String name = (String) list.get(0);
		// String이 가지는 메서드(기능)을 쓰려면 반드시 String으로 강제형변환해주어야함
		System.out.println(name.charAt(0));
		System.out.println(name.length());

		int age = (Integer) list.get(1);
		System.out.println(age + 1);

		double jumsu = (Double) list.get(2);
		System.out.println(jumsu + 10);

		JButton b = (JButton) list.get(3);
		b.setText("나는 진짜 버튼");

	}

}
