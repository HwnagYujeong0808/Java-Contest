package day06;
// 상속 : 
public class SuperMan extends Person {

	SuperMan(){
		super();
		// 부모클래스의 기본생성자를 호출
		// this 나 자신을 가리키는 참조변수
		// super 부모 
		// 나의 기본생성자 : this() 
		// 부모의 기본생성자 : super()
		System.out.println("슈퍼맨 클래스의 생성자");
	}
	void laser() {
		System.out.println("레이저 발사~~ ");
	}
	void fly() {
		System.out.println("펄럭펄럭 날아요 ");
	}
	
}
