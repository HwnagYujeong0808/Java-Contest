package day09;
// import java.lang.*; 
// ��Ƽ ������ ó���ϴ� ��� 
// 1 . Thread Ŭ������ ��ӹ޴´�. 
// 2.  run () override 
// 3.  start() : ���� 
public class ThreadEx2 extends Thread{
	ThreadEx2(String name){
		super(name); // 
	}
	
	@Override
	public void run() {
		// ���ÿ� ó���ϰ� �� �ڵ�
		Thread th = Thread.currentThread();
		for( int i =1 ; i <= 100; i++) {
			System.out.println(
				th.getName() + " : " + i + " ���� �޸�����");
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx2 th1 = new ThreadEx2("õ����");
		ThreadEx2 th2 = new ThreadEx2("������");
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread().getName() + "���ξ������ �� ���ϰ� ���� �� ^^ ");
	}
	
}


