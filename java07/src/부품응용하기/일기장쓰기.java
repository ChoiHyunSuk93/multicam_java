package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	// 멤버변수 - 안써도 됌
	// 멤버 메서드
	public void open() {
		// jframe화면이 보이게 하자.! 기능을 정의하도록 함.
//		System.out.println("화면이 open될거예요..");
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("내 일기장 작성화면");
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel dayJLabel = new JLabel("오늘의 날짜: ");
		JLabel titleJLabel = new JLabel("오늘의 제목: ");
		JLabel contentJLabel = new JLabel("오늘의 내용: ");

		JTextField dayTextField = new JTextField(20);
		JTextField titleTextField = new JTextField(20);
		JTextArea contentTextArea = new JTextArea(10, 20); // (줄, 가로글자)
		dayTextField.setHorizontalAlignment(JTextField.CENTER);
		titleTextField.setHorizontalAlignment(JTextField.CENTER);

		Font font = new Font("D2Coding", Font.BOLD, 20);
		dayJLabel.setFont(font);
		titleJLabel.setFont(font);
		contentJLabel.setFont(font);
		dayTextField.setFont(font);
		titleTextField.setFont(font);
		contentTextArea.setFont(font);

		JButton btn = new JButton("파일에 일기 저장");
		btn.setFont(font);
		btn.setBackground(Color.blue);
		btn.setForeground(Color.green);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String day2 = dayTextField.getText();
				String title2 = titleTextField.getText();
				String content2 = contentTextArea.getText();
				// 파일도 만들어주고, 자바프로그램과 file간에 연결통로(강물, stream)을 만들어준다.
				// 외부에 있는 파일, 네트워크나 cpu등을 자바에서 연결할 때는
				// 아주 위험한 상황이라고 인식!
				// 이렇게 위험한 상황에서 만약 문제가 발생하면 어떻게 처리할지를 꼭 써주어야함!
				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close();
					JOptionPane.showMessageDialog(f, "저장되었습니다.");
					f.setVisible(false);
				} catch (IOException e1) {
					JOptionPane.showConfirmDialog(f, "파일 저장 중 문제 발생");
				} // try-catch
			}
		}); // btn add end

		f.add(dayJLabel);
		f.add(dayTextField);
		f.add(titleJLabel);
		f.add(titleTextField);
		f.add(contentJLabel);
		f.add(contentTextArea);
		f.add(btn);

		f.setVisible(true);

	}

}
