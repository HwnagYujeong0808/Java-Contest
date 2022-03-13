package day06;

public class TestMain {
	public static void main(String[] args) {
		// 객체 생성 
		Person p = new Person();
		
		//p.age = 20;
		System.out.println(p.age);
		// eating() 호출
		p.eating("순두부찌개");
		
		// talk() 호출 
		p.talk();
		
		p.status();
		//////////////////////////// 
		//  30 살 홍길동 의사 남 
		Person p2 = new Person();
		p2.age = 30;
		p2.name = "홍길동";
		p2.job = "의사";
		p2.gender="남";
		p2.status();
		
		System.out.println("--------------------");
		Person p3 = new Person("홍길동",30,"의사", "남");
		p3.status();
		System.out.println("--------------------");
		Person p4 = new Person(24,"학생", "콩순이");
		p4.status();
		
	}
}
