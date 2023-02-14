package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import 부품응용하기.일기장쓰기;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		// 폰트, flowlayout
		// jframe, imageicon, imagelabel
		// idlabel, pwlabel, id입력값, pw입력값
		// 로그인버튼, reset버튼

		JFrame f = new JFrame();
		f.setSize(500, 600);
		f.setTitle("내 일기장 로그인");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login1.png");
		ImageIcon icon3 = new ImageIcon("reset.png");

		JLabel topLabel = new JLabel();
		JLabel idLabel = new JLabel("    아이디: ");
		JLabel pwLabel = new JLabel("패스워드: ");

		JTextField idTextField = new JTextField(20);
		JTextField pwTextField = new JTextField(20);
		idTextField.setHorizontalAlignment(JTextField.CENTER);
		pwTextField.setHorizontalAlignment(JTextField.CENTER);

		Font font = new Font("D2Coding", Font.BOLD, 20);
		idLabel.setFont(font);
		pwLabel.setFont(font);
		idTextField.setFont(font);
		pwTextField.setFont(font);

		JButton loginButton = new JButton();
		JButton resetButton = new JButton();

		topLabel.setIcon(icon1);
		loginButton.setIcon(icon2);
		resetButton.setIcon(icon3);

		f.getContentPane().setBackground(Color.green);
		loginButton.setBackground(Color.green);
		resetButton.setBackground(Color.green);

		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = idTextField.getText(); // "root"
				String pw2 = pwTextField.getText(); // "1234"
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					// 일기장 쓰기 부품의 open()기능 쓰자!
					일기장쓰기 diary = new 일기장쓰기();
					diary.open(); // 메서드 사용 -> 메서드 호출!!
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				} // if

			}
		}); // login add end

		resetButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				idTextField.setText("");
				pwTextField.setText("");
			}
		}); // reset add end

		f.add(topLabel);
		f.add(idLabel);
		f.add(idTextField);
		f.add(pwLabel);
		f.add(pwTextField);
		f.add(loginButton);
		f.add(resetButton);

		f.setVisible(true);
	}

}
