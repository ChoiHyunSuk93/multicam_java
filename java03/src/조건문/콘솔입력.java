package 조건문;

import java.util.Scanner;

public class 콘솔입력 {

	public static void main(String[] args) {
		// Scanner
		Scanner	sc = new Scanner(System.in); // 컴퓨터.키보드
		// 자바프로그램과 콘솔 간에 통로를 만든다.
		// 연결통로 == 강물(스트림, Stream)
		// Stream은 내가 닫아주지 않으면 계속 가지고 있게 됨.
		System.out.print("요일 입력: 주중1) 주말2) ");
		int data = sc.nextInt(); //String을 int로 변환
		if (data == 1) {
			System.out.println("열심히 달리자!");
		} else {
			System.out.println("쉬자!");
		}
		
		System.out.print("주말에 뭐할까? ");
		String data2 = sc.next();
		System.out.println("나는 주말에 " + data2 + "(을)를 할거야.");
		sc.close();
		
	}

}
