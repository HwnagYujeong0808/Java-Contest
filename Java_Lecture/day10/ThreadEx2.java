package day09;
// import java.lang.*; 
// 멀티 쓰레드 처리하는 방법 
// 1 . Thread 클래스를 상속받는다. 
// 2.  run () override 
// 3.  start() : 실행 
public class ThreadEx2 extends Thread{
	ThreadEx2(String name){
		super(name); // 
	}
	
	@Override
	public void run() {
		// 동시에 처리하게 할 코드
		Thread th = Thread.currentThread();
		for( int i =1 ; i <= 100; i++) {
			System.out.println(
				th.getName() + " : " + i + " 미터 달리는중");
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx2 th1 = new ThreadEx2("천둥이");
		ThreadEx2 th2 = new ThreadEx2("각설탕");
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread().getName() + "메인쓰레드는 일 다하고 집에 감 ^^ ");
	}
	
}


