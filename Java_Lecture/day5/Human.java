package day05;

// 속성 : 이름, 나이 , 성별, 직업 

// 기능 : 먹기() , 말하기(), 숨쉬기()
// 행위 
public class Human {
	// 클래스 , 전역변수 : 어떤 메서드에서도 이 변수를 사용할수 있다. 
	String 이름 , 직업, 성별; 
	int 나이 ; 
	// constructor 
	Human(){
		// 멤버변수의 초기화를 담당 
		// 클래스의 이름과 동일 이름을 갖는다. 
		// 생성가능 하며 , 생략시 모든 멤버변수의 기본값으로 초기화 
		this.나이 = 20;
		this.이름 = "홍길동";
		this.직업 = "도적";
		this.성별 = "남";
		System.out.println("기본 생성자가 호출됨!!");
	}
	// constructor overloading
	Human(int age , String name , String job, String gender){
		this.이름 = name;
		this.직업 = job;
		this.나이 = age;
		this.성별 = gender;
		System.out.println("int String String String 생성자");
	}
	// 변수 
	// this : 자기 자신을 가리키는 참조변수 
	Human(String 이름 , String 직업 , int 나이){
//		int a = 10;
//		a = a ; 
		this.이름 = 이름;
		this.직업 = 직업;
		this.나이 = 나이;
		
		System.out.println("String String int 생성자");
	}
	Human(String name , int age , String job, String gender){
		this.이름 = name;
		this.나이 = age;
		this.직업 = job;
		this.성별 = gender;
	} 
	
	void 먹기() {
		System.out.println("냠냠 밥을 먹어요 ");
	}
	void 말하기() {
		System.out.println("쏙딱쏙딱");
	}
	void 숨쉬기() {
		System.out.println("후아 ~ 후아~");
	}
	void status() {
		System.out.println("이름 : " + 이름);
		System.out.println("나이 : " + 나이);
		System.out.println("성별 : " + 성별);
		System.out.println("직업 : " + 직업);
	}
}
