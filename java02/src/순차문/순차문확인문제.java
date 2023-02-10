package 순차문;

import javax.swing.JOptionPane;

public class 순차문확인문제 {

	public static void main(String[] args) {
		// 비만도 계산기
		// BMI = 체중(kg) / (신장(m) *신장(m))
		// 입력
		String height = JOptionPane.showInputDialog("키를 입력하세요(cm)");
		String weight = JOptionPane.showInputDialog("몸무게를 입력하세요(kg)");
		
		// 처리
		double h = Double.parseDouble(height) / 100;
		double w = Double.parseDouble(weight);
		double bmi = w / (h * h);
		String result = "당신의 BMI는 " + bmi + "입니다.";
		// 출력
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}

}
