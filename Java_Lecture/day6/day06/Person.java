package day06;

// 1. member field
// 2. constructor
// 3. member method 
public class Person {
	int age;
	String name , gender, job; 
	// 기본생성자가 1개 존재하는 것으로 간주
	Person(){
		// 객체의 초기화를 담당 
		// class 이름과 동일한이름 
		// 리턴값이 없는 메서드 , 리턴키워드 X 
		// void 키워드 사용하지 않는다. 
		// 기본생성자는 멤버변수의 기본값을 할당
		age = 27;
		name = "IU";
		gender = "여";
		job = "가수/배우";
		
		System.out.println("기본생성자 호출... ");
	}
	Person(String name , int age , String job, String gender ){
		this(age, name, job);  // 첫번째 라인에 와야함.
//		this.name = name;   this() <--
		//                  this(age, name) 
//		this.age = age;
//		this.job = job;
		this.gender = gender;
		System.out.println(
				"String int String String 매개변수 생성자");
	}
	Person(int age , String name , String job){
		this();  // 기본생성자 호출
		this.age = age;
		this.name = name;
		this.job = job;
		System.out.println("int String String 생성자");
	}
	void eating(String it) {
		System.out.println(
				it + "을/를 먹어요");
	}
	void talk() {
		System.out.println("속닥속닥");
	}
	void status() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("직업 : " + this.job);
		System.out.println("성별 : " + this.gender);
	}
}
