package day07;

public class TestMain3 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		//Child c2 = new Child();
		//c2 = c ;
		System.out.println("----------------");
		p = c; 
		// 부모의 참조변수에 자식의 참조값을 담는 것은 예외적으로 가능 
		// c = p;  XXX 
		p.eating();
		p.singing();
		p.nagging();
		// p.goClub();
		// Parent 클래스의 존재하는 변수와 메서드만 접근 가능
		Child c2 = new Child();
		System.out.println(" P : "+ p);
		System.out.println(" c : " + c);
		c2 = c;
		System.out.println(" c2 :" + c2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
