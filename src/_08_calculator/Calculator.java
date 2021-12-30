package _08_calculator;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Calculator implements ActionListener {
	JButton buttonAdd = new JButton();
	JButton buttonSub = new JButton();
	JButton buttonDiv = new JButton();
	JButton buttonMulti = new JButton();
	JLabel label = new JLabel();
	String Num1 = JOptionPane.showInputDialog("Enter a number");
	String Num2 = JOptionPane.showInputDialog("Enter another number");
	int num = Integer.parseInt(Num1);
	int num2 = Integer.parseInt(Num2);
	JFrame frame = new JFrame();
int add(int num, int num2){
	return num+num2;
}

int subtract(int num, int num2) {
	return num-num2;
}

int multiply(int num, int num2) {
	return num*num2;
}

int divide(int num, int num2) {
	return num/num2;
}
void run(){
	
	JPanel panel = new JPanel();
	frame.setVisible(true);

	
	buttonAdd.setText("Add");
	buttonSub.setText("Sub");
	buttonDiv.setText("Div");
	buttonMulti.setText("Multi");


buttonAdd.addActionListener(this);
buttonSub.addActionListener(this);
buttonDiv.addActionListener(this);
buttonMulti.addActionListener(this);

	
	panel.add(buttonSub);
	panel.add(buttonMulti);
	panel.add(buttonDiv);
panel.add(buttonAdd);
panel.add(label);
frame.add(panel);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();

	if (buttonPressed == buttonAdd) {
		int x =add(num,num2);
		label.setText(x + "");
}
	if (buttonPressed == buttonSub) {
		int x =subtract(num,num2);
		label.setText(x + "");
	}
	if (buttonPressed == buttonDiv) {
		int x = divide(num,num2);
		label.setText(x + "");
	}
	if (buttonPressed == buttonMulti) {
	int x =	multiply(num,num2);
	label.setText(x + "");

}
	frame.pack();
}

}
