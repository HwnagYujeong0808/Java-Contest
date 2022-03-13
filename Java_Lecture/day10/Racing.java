package day10;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing  extends JFrame{
	// Component 
	JButton jbtn;
	
	Racing(){
		jbtn = new JButton("버튼"); 
		setTitle("경마장");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 500);
		setLocation(150,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Racing r = new Racing();
	}
}
