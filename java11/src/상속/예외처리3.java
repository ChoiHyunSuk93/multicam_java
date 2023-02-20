package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		try {
			num[3] = 2; // 문제가 생길 여지가 있는 코드!
		} catch (Exception e) {
			// 문제가 생겼을 때 어떻게 처리할지를 써주면 됌
//			e.printStackTrace();
			System.out.println("배열에 문제가 있음.");
		}
		System.out.println(num.length); // 배열의 개수
	}

}
// 예외처리
// 1. 예외처리를 왜 하는가? 안하면 어떻게 되는가?
// - 안하면 에러 발생시 코드가 전부 멈춰버려서 프로그램이 작동하지 않음
// - 특정부분의 실행을 포기하고 프로그램을 중단시키지 않기 위해서.
// 2. 에러는 컴파일에러, 실행에러 비교!
// - 컴파일(번역)에러 : 문법적 오류 
// - 실행(run-time)에러 : 논리적 문제, 자원 연결 문제
// 3. 자바에서 예외처리하는 방법
// - try-catch문으로 감싸주고 catch문 안쪽에 문제 발생 시 어떻게 처리할지를 써준다.
// 4. 반드시 예외처리해야하는 경우는?
// - 외부 자원을 연결할 때(스트림을 사용할 때) : ex) 파일, cpu, 네트워크, db 연결
