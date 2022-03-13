package day05;

public class TestMain3 {
	public static void main(String[] args) {
		Human h1 = new Human();
//		h1.이름 = "유관순"; 
//		h1.나이  = 22;
//		h1.성별 = "여";
//		h1.직업 = "학생"; 
		h1.status();
		System.out.println("-------------------");
		Human h2 = new Human(22, "유관순", "학생", "여");
		h2.status();
		System.out.println("-------------------");
		Human h3 = new Human("아기상어", "상어", 1);
		h3.status();
		Human h4 = new Human("홍길순",20,"도적","여" );
		h4.status();
		// this. 키워드 사용 
		
		
	}
}
