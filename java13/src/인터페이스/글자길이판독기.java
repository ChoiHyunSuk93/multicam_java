package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {

		JFrame f = new JFrame("문자판독기");
		f.setSize(400, 500);
		f.setLayout(new FlowLayout());

		Font font = new Font("궁서", Font.BOLD, 30);

		JLabel label = new JLabel("문장을 넣으세요,");
		JTextArea text = new JTextArea(5, 10);

		JButton b1 = new JButton("글자수카운트");
		JButton b2 = new JButton("배경색 변경");
		JButton b3 = new JButton("글자색바꾸기");

		label.setFont(font);
		text.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(label);
		f.add(text);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String words = text.getText();
				JOptionPane.showMessageDialog(f, "글자수는" + words.length());
				text.setText(null);
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setBackground(Color.yellow);
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.red);
			}
		});

		f.setVisible(true);
	}

}
