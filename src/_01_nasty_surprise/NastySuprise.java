package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JFrame frame1 = new JFrame();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JPanel panel = new JPanel();
public void run() {
	
	
	
	frame1.add(panel);
	panel.add(button1);
	panel.add(button);
	frame1.setVisible(true);
	button.setText("Treat");
	button1.setText("Trick");
	

	button.addActionListener(this);
	button1.addActionListener(this);

}
		
	


private static void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource() == button) {
		showPictureFromTheInternet("https://hips.hearstapps.com/countryliving.cdnds.net/17/47/1511194376-cavachon-puppy-christmas.jpg");
	}
	if(e.getSource() == button1) {
		showPictureFromTheInternet("https://i.pinimg.com/originals/38/9c/89/389c8924c29372cf6d82c357fb2a26e6.jpg");
	}
}}
