package day06;

public class Whale extends Mammal{

	
	Whale(){
		eye = 2; nose=1 ; ear=2;
		name = "고래"; species = "혹등고래";
		System.out.println("고래 기본 생성자");
	}
	void eating(){
		System.out.println("새우를 좋아해요 냠냠");
	}
	// 재정의 : method overriding
	void sleeping() {
		System.out.println("바다위에 누워 쿨쿨 ~~~");
	}
	void swimming() {
		System.out.println("헤엄치는 중 ");
	}
}
