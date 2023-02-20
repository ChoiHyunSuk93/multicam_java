package 형변환;

import java.util.ArrayList;

public class 스키대회시상자목록 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1등이 박스키, 2등이 송스키, 3등이 김스키, 4등이 정스키
		// 2등이 반칙하여 탈락함.
		// 스키대회 시상자 목록을 프린트!
		
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		list.remove(1); // 2등 반칙 탈락
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "등: " + list.get(i));
		}
		System.out.println(list.contains("김연아"));
		System.out.println(list.size());
		
		ArrayList list2 = new ArrayList();
		list2.add("이스키");
		list2.add("박스키");
		list2.add("양스키");
		list.addAll(list2); // 파괴형함수
		System.out.println(list);
		
		System.out.println(list2.isEmpty());
		System.out.println(list2);
		list2.clear(); // 전체삭제
		System.out.println(list2);
	}

}
