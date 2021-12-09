package _04_chuckle_clicker;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JButton button = new JButton();
	JPanel panel = new JPanel();

	void makeButtons() {
		frame.setVisible(true);

		panel.add(button);
		panel.add(button1);
		frame.add(panel);

		button.setText("punchline");
		button1.setText("joke");
		button.addActionListener(this);
		button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == button) {
			System.out.println("hi");
			System.out.println("I'm not short, I'm fun sized!");
		}
		if (buttonPressed == button1) {
			System.out.println("hi");
			System.out.println("I only know 25 letters of the alphabet I don't know y");
		}
		

	}
}
