package day06;
// 추상 클래스 
// 인스턴스화 할 수 없는 클래스 
public abstract class Mammal {
	int eye, nose, ear;
	String name , species;
	// method Overriding 
	// 재정의 
	// 모든 자손 클래스가 이 메서드를 오버라이드 하기 때문에
	// 따로 정의해둘 필요가 없어서 X 
	abstract void eating();
	// 추상 메서드 , 메서드 body X 
	// 미구현 메서드 
	abstract void sleeping();
	void see() {
		System.out.println("볼수 있어요 ");
	}
}
