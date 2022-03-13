package day10;

// 멀티 쓰레드 처리 
// 1. Runnable implements 
// 2. run () override 
// 3. 구현 객체를 생성
// 4. Thread 클래스의 생성자에 매개변수로 전달
// 5. Thread 클래스를 통해서 start() 

public class ThreadEx3 implements Runnable {
	String name ;
	ThreadEx3(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		// 동시 처리하고자 하는 코드 
		for (int i = 1; i <= 100; i++) {
			System.out.println(
					name + " : "+ i + " 미터 달리는중");
		}
	}
	public static void main(String[] args) {
		ThreadEx3 r1 = new ThreadEx3("토끼");
		ThreadEx3 r2 = new ThreadEx3("거북이");
		
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		
		th1.start();  // runnable ==> running 
		th2.start();
		
		
		
	}
	

}
