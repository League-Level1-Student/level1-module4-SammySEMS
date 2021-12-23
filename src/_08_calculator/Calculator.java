package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Calculator implements ActionListener {
	JButton buttonAdd = new JButton();
	JButton buttonSub = new JButton();
	JButton buttonDiv = new JButton();
	JButton buttonMulti = new JButton();

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
	JFrame frame = new JFrame();
	frame.setVisible(true);
	

	buttonAdd.setText("Add");
	buttonSub.setText("Sub");
	buttonDiv.setText("Div");
	buttonMulti.setText("Multi");


buttonAdd.addActionListener(this);
buttonSub.addActionListener(this);
buttonDiv.addActionListener(this);
buttonMulti.addActionListener(this);


	
	frame.add(buttonAdd);
	frame.add(buttonMulti);
	frame.add(buttonDiv);
	frame.add(buttonSub);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();

	if (buttonPressed == buttonAdd) {
		int add(int num, int num2)
}
}}
