package day10;

import java.util.Random;

public class ATMThread extends Thread{
	ATM atm;
	Random rnd = new Random();
	ATMThread(ATM atm){
		this.atm = atm;
	}
	
	@Override
	public void run() {
		// 5회 입금 5회 출금 
		boolean flag = true;
		for (int i=0;i<10;i++) { 
			int money = rnd.nextInt(10)*1000;
			if(flag)
				atm.deposit(money);
			else
				atm.withDraw(money);
			flag = !flag;
		}	
	}
	
}
