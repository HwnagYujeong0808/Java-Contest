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
	
	// public ����Ÿ��  get������(){
	//    return this.������;
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
	// public void set������(�ڷ��� ������){
	//    this.������ = ������;
	//}
	
	// getXXX() : ��������� �� �������� ���� 
	// setXXX() : ��������� ���� �����ϱ� ���� 
	// getter, setter , 
	
	// �Ա�
	public synchronized void deposit(int a) {
		balance += a;
		System.out.println(a + " �� �Ա��մϴ�");
		
		System.out.println("���� �ܾ� : " + balance);
	}
	// ���
	public synchronized void withDraw(int a) {
		// db�� ����... 
		// ������ �ִ��� �˻�.. 
		// ������ �ִ� ����̶�� �Ʒ� �۾��� ����...
		// ������ 
		if ( balance >= a) {
			balance -= a;
			System.out.println(a + " �� ����մϴ�");
			System.out.println("���� �ܾ� : " + balance);
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println("���� �ܾ� : " + balance);
		}
	}
	
	
}
