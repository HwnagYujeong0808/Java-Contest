package day10;

public class ATMTest {
	public static void main(String[] args) {
		// 통장개설
		ATM atm = new ATM("홍길동", 10000);
		
		// 동시에 여러은행지점에서 이 계좌로 
		// 입금, 출금 동시에 처리한다고 가정.. 
		
		ATMThread at1 = new ATMThread(atm);
		ATMThread at2 = new ATMThread(atm);
		ATMThread at3 = new ATMThread(atm);
		
		// 입, 출금 시작
		at1.start();
		at2.start();
		at3.start();
		
	}
}
