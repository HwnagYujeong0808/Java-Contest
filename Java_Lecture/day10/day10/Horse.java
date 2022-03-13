package day10;

import java.util.Random;

import javax.swing.JButton;

public class Horse extends Thread{
	JButton jbtn;
	
	public Horse(JButton jbtn) {
		this.jbtn = jbtn;
	}
	
	@Override
	public void run() {
		// 현재 버튼의 위치를 변경하는 코드
		Random rnd = new Random();
		for(int i =0 ;i <100;i++) {
		
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			jbtn.setLocation(
				jbtn.getX()+rnd.nextInt(20),jbtn.getY()) ;
		}
	}
}
