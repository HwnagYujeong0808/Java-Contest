package day05;
// 객체의 설계도 , 틀 : class
// 구성요소
// 1. 멤버변수, 멤버필드
// 2. 멤버메서드 

public class Car {
	// 속성  , 멤버변수 , 멤버 필드 
	int 핸들, 바퀴 , 엔진, 문, 속도;
	String 차종, 제조사 ; 
	void 전진() {
		System.out.println("부릉부릉~~~");
	}
	void 후진() {
		System.out.println("띠리리~~~");
	}
	void 정지() {
		System.out.println("끼익~!!! ");
	}
	void 가속 () {
		System.out.println("슝~~~");
	}
	void 감속() {
		System.out.println("~~~ 감속~~~ ");
	}
}
