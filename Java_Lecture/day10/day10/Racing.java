package day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing  extends JFrame 
				implements ActionListener{
	// Component 
	JButton jbtn;
	JButton jbtn1, jbtn2, jbtn3;
	ImageIcon img;
	
	Racing(){
		// 배치관리자를 사용하지 않음 
		setLayout(null);
		img  = new ImageIcon("src/images/horse.gif");
		
		// 버튼 객체 생성
		jbtn = new JButton("버튼");
		jbtn1 = new JButton(img);
		jbtn2 = new JButton(img);
		jbtn3 = new JButton(img);
		
		
		// 버튼의 크기
		jbtn.setSize(250, 60);
		jbtn1.setSize(120, 60);
		jbtn2.setSize(120, 60);
		jbtn3.setSize(120, 60);
		
		// 버튼의 위치
		jbtn.setLocation(350,400);
		jbtn1.setLocation(50,50);
		jbtn2.setLocation(50,150);
		jbtn3.setLocation(50,250);
		
		// 버튼을 추가 
		add(jbtn);
		add(jbtn1);add(jbtn2);add(jbtn3);
		jbtn.addActionListener(this);
		
		
		setTitle("경마장");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 500);
		setLocation(50,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Racing r = new Racing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//현재 버튼의 위치를 화면에 출력
		Horse h1 = new Horse(jbtn1);
		Horse h2 = new Horse(jbtn2);
		Horse h3 = new Horse(jbtn3);
		
		h1.start();
		h2.start();
		h3.start();
		
		
//		for( int i =  1; i<30;i++) {
//			jbtn1.setLocation(jbtn1.getX()+10, jbtn1.getY());
//			jbtn2.setLocation(jbtn2.getX()+10, jbtn2.getY());
//			jbtn3.setLocation(jbtn3.getX()+10, jbtn3.getY());			
//		}
		// System.out.println("버튼이 눌리면 내가 호출됨");
		
	}
}
