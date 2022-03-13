package day10;

public class ATM {
	private int balance;
	String name;
	String accountNo;
	ATM (String name , int balance){
		this.name = name;
		this.balance = balance;
		accountNo = "111111";
	}
	
//	ATM(){
//		balance = 0;
//		name = null;
//		accountNo = null;
//	}
	
	// public 리턴타입  get변수명(){
	//    return this.변수명;
	// }
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
	 
		return this.balance;
	}
	public void setBalance(int balance) {
	
		this.balance = balance;
	}
	// public void set변수명(자료형 변수명){
	//    this.변수명 = 변수명;
	//}
	
	// getXXX() : 멤버변수의 값 가져오기 전용 
	// setXXX() : 멤버변숴의 값을 지정하기 전용 
	// getter, setter , 
	
	// 입금
	public synchronized void deposit(int a) {
		balance += a;
		System.out.println(a + " 원 입금합니다");
		
		System.out.println("현재 잔액 : " + balance);
	}
	// 출금
	public synchronized void withDraw(int a) {
		// db에 연결... 
		// 권한이 있는지 검사.. 
		// 권한이 있는 사람이라면 아래 작업을 수행...
		// 감사기록 
		if ( balance >= a) {
			balance -= a;
			System.out.println(a + " 원 출금합니다");
			System.out.println("현재 잔액 : " + balance);
		}else {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재 잔액 : " + balance);
		}
	}
	
	
}
