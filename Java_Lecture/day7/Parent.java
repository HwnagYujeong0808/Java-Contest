package day07;

public class Parent {
	String name , job;
	int age;
	Parent(){
		System.out.println("�θ� ������");
	}
	Parent(String name){
		this.name = name;
		System.out.println("String : �θ� ������");
	}
	public void eating() {
		System.out.println("�����Ÿ� �Ծ�� ");
	}
	public void singing() {
		System.out.println("�� ���̰� ���~~~ ");
	}
	public void nagging() {
		System.out.println( " ���� ģ�� �Ƶ���.... ");
	}
	
}
