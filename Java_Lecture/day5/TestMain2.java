package day05;

public class TestMain2 {
	public static void main(String[] args) {
		// 홍길동
		Human h1 = new Human();
		h1.status();
		System.out.println("------------------");
		h1.이름 = "홍길동";
		h1.직업 = "도적";
		h1.나이 = 20;
		h1.성별 = "남";
		h1.status();
		// h2 : 신사임당
		// 객체를 만들고 
		Human h2 = new Human();
		// 값을 초기화 
		h2.나이 = 30;
		h2.이름 = "신사임당"; 
		h2.성별 = "여"; 
		h2.직업 = "화가"; 
		// 상태정보 출력 
		h2.status();
		
		
	}
}
