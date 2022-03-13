package day06;

public class Horse extends Mammal {
	
	Horse(){
		System.out.println("말 생성자 ");
	}
	
	void running() {
		System.out.println("말 달리자..~~~");
	}
	// 오버라이드 메서드와
	// 일반 메서드 구부
	// annonation
	
	@Override
	void eating() {
		System.out.println("각설탕 좋아해요");
	}
	@Override
	void sleeping() {
		System.out.println("건초위에서 잡니다.");
	}
	
}
