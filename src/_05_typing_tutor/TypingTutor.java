package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
		label.setFont(label.getFont().deriveFont(80.0f));
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		//frame.pack();
		frame.setSize(500, 500);
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyPressed = e.getKeyChar();
		if(keyPressed==currentLetter) {
			System.out.println("You typed: " + keyPressed);
			System.out.println("correct!");
			panel.setBackground(Color.green);
			
			

			
		}
		else {
		panel.setBackground(Color.red);

		}
		System.out.println(keyPressed);

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
