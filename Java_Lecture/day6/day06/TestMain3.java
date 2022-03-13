package day06;

public class TestMain3 {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		System.out.println(m2);
		m1.attack(m2);
		System.out.println(
		"m2.hp : "+ m2.hp);
		
		Marine m3 = new Marine(500); // 체력 500짜리 마린만들기
		// 다음 코드가 가능하도록 Marine 클래스 코드를 추가하세요 
		m3.status();
		
//		m1.status();
//		m1.move(100,100);
//		m1.attack();
//		m1.steampack();
//		m1.steampack();
//		m1.steampack();
//		m1.steampack();
//		m1.steampack();
//		m1.status();
		
		
	}
}
