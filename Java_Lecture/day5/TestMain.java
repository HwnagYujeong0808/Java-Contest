package day05;

public class TestMain {
	public static void main(String[] args) {
		// float[] m ; 
		// 자료형 변수명
		// class : 사용자 정의 자료형
		Car c ; 
		c = new Car();
		System.out.println("c : "+ c);
		System.out.println(c.문);
		System.out.println(c.핸들);
		System.out.println(c.바퀴);
		System.out.println(c.제조사);
		c.차종 = "테슬라 모델3";
		c.제조사 = "테슬라"; 
		c.문 = 4;
		c.핸들 = 1;
		System.out.println("-------------------");
		System.out.println(c.문);
		System.out.println(c.핸들);
		System.out.println(c.바퀴);
		System.out.println(c.제조사);
		
		c.전진();
		c.후진();
		c.감속();
		c.정지();
		c.가속();
		
		
		Car c2 = new Car();
		System.out.println(c2.문);
		System.out.println(c2.핸들);
		System.out.println(c2.바퀴);
		System.out.println(c2.제조사);
		
		
		
	}
}
