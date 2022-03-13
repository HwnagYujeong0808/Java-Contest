package day07;

public class Parent {
	String name , job;
	int age;
	Parent(){
		System.out.println("부모 생성자");
	}
	Parent(String name){
		this.name = name;
		System.out.println("String : 부모 생성자");
	}
	public void eating() {
		System.out.println("맛난거만 먹어요 ");
	}
	public void singing() {
		System.out.println("내 나이가 어때서~~~ ");
	}
	public void nagging() {
		System.out.println( " 엄마 친구 아들은.... ");
	}
	
}
