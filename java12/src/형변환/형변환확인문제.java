package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		// 나에 대한 데이터 모아보기
		// 돈: 1000, 키: 189.1, 아침여부: false, 성별: 남
		ArrayList list = new ArrayList();
		list.add(1000); // Object <-업캐스팅- Integer <-오토박싱- int
		list.add(189.1); // Object <- Double <- double
		list.add(false); // Object <- Boolean <- boolean
		list.add('남'); // Object <- Character <- char

		// 1. 전체 목록 프린트
		System.out.println(list);
		// 2. 돈 1000을 꺼내서 2000을 더해 프린트
		int money = (Integer) list.get(0); // int <-오토언박싱- Integer <- 다운캐스팅 - Object
		System.out.println(money + 2000);
		// 3. 키 189.1을 꺼내서 10을 더해 프린트
		double height = (Double) list.get(1);
		System.out.println(height + 10);
		// 4. 아침여부를 꺼내서 아침을 먹었으면 배불러요, 아니면 배고파요.
		boolean breakfast = (Boolean) list.get(2);
		if (breakfast == true) {
			System.out.println("배불러요.");
		} else {
			System.out.println("배고파요.");
		}
		// 5. 성별 꺼내서 남이면 주민번호 1,3 아니면 주민번호 2,4
		char gender = (Character) list.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1or3");
		} else {
			System.out.println("주민번호는 2or4");
		}
		
		
		// 1) 형변환(캐스팅)이란?
		// - 형태를 변환시키는 것
		// 2) 업캐스팅이란? 다른말은?
		// - 하위 개념에서 상위 개념으로 갈 때 하는 형변환. 
		// 3) 다운캐스팅이란? 다른말은?
		// - 상위 개념에서 하위 개념으로 갈 때 하는 형변환
		// 4) Car <- Truck에서 부모클래스, 자식클래스 구분
		// 부모 : Car, 자식 : Truck
		// 5) byte b = 100; int i = b; 내부에서 일어난 처리 내용은?
		// 업캐스팅. 자동형변환.
		// 6) int i2 = 10; byte b2 = (byte) i2; 내부에서 일어난 처리 내용은?
		// 다운캐스팅. 강제형변환.
		// 7) 오토박싱이란?
		// - 업캐스팅시
		// 8) 오토언박싱이란?
		// - 다운캐스팅시
		// 9) 다음 각 줄에 주석을 달아주세요.
//		ArrayList list = new ArrayList();  
//		list.add(100);  Object <-업캐스팅- Integer <-오토박싱- int
//		int age = (Integer)list.get(0); 

		
		
		

	}

}
