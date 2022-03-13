package day10;

// ��Ƽ ������ ó�� 
// 1. Runnable implements 
// 2. run () override 
// 3. ���� ��ü�� ����
// 4. Thread Ŭ������ �����ڿ� �Ű������� ����
// 5. Thread Ŭ������ ���ؼ� start() 

public class ThreadEx3 implements Runnable {
	String name ;
	ThreadEx3(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		// ���� ó���ϰ��� �ϴ� �ڵ� 
		for (int i = 1; i <= 100; i++) {
			System.out.println(
					name + " : "+ i + " ���� �޸�����");
		}
	}
	public static void main(String[] args) {
		ThreadEx3 r1 = new ThreadEx3("�䳢");
		ThreadEx3 r2 = new ThreadEx3("�ź���");
		
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		
		th1.start();  // runnable ==> running 
		th2.start();
		
		
		
	}
	

}
