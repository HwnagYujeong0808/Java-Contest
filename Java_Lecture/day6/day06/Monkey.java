package day06;

public class Monkey extends Mammal {
	
	Monkey(){
		eye = 2; nose=1 ; ear=2;
		name = "원숭이"; species = "빨간코원숭이";
		System.out.println("원숭이 기본 생성자");
	}
	void eating(){
		System.out.println("바나나를 좋아해요 냠냠");
	}
	void sleeping() {
		System.out.println("나무 위에서 쿨쿨 잡니다.~~~");
	}
	void climbing() {
		System.out.println("나무를 잘 타요");
	}

}
