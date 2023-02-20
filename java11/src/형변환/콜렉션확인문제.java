package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 한번 갔던 여행지는 가지 않으려고 합니다. 가고 싶은 여행지 5곳을 컬렉션으로 만들어서 프린트
		HashSet tour = new HashSet();
		tour.add("베네치아");
		tour.add("이집트");
		tour.add("몰타");
		tour.add("삿포로");
		tour.add("기타큐슈");
		System.out.println(tour);

		// 2. 각 방에 물건 배치입니다. 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고, 현관에는 신발의 정보를 컬렉션으로 만들어서 프린트
		// 2-1) 전체 프린트 , 2-2) 현관에는 무엇이 있나요? 2-3) 거실에 책상으로 변경하여 전체 프린트

		HashMap room = new HashMap();
		room.put("안방", "TV");
		room.put("거실", "쇼파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		System.out.println(room); // 2-1
		System.out.println(room.get("현관")); // 2-2
		room.replace("거실", "책상");
		System.out.println(room); // 2-3

		// 3. 오늘 내가 할 일 우선순위 5개 목록을 만들어서
		// 1) 전체 프린트 2) 첫번째 할 일과 마지막 할 일 프린트 3) 2번째 할 일을 "청소"로 변경해서 전체 프린트

		ArrayList today = new ArrayList();
		today.add("자바공부");
		today.add("방정리");
		today.add("운동");
		today.add("게임");
		today.add("내일할것정리");

		System.out.println(today); // 1)
		System.out.println(today.get(0));
		System.out.println(today.get(today.size() - 1));// 2)
		today.set(1, "청소");
		System.out.println(today); // 3)

	}

}
