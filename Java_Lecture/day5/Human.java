package day05;

// �Ӽ� : �̸�, ���� , ����, ���� 

// ��� : �Ա�() , ���ϱ�(), ������()
// ���� 
public class Human {
	// Ŭ���� , �������� : � �޼��忡���� �� ������ ����Ҽ� �ִ�. 
	String �̸� , ����, ����; 
	int ���� ; 
	// constructor 
	Human(){
		// ��������� �ʱ�ȭ�� ��� 
		// Ŭ������ �̸��� ���� �̸��� ���´�. 
		// �������� �ϸ� , ������ ��� ��������� �⺻������ �ʱ�ȭ 
		this.���� = 20;
		this.�̸� = "ȫ�浿";
		this.���� = "����";
		this.���� = "��";
		System.out.println("�⺻ �����ڰ� ȣ���!!");
	}
	// constructor overloading
	Human(int age , String name , String job, String gender){
		this.�̸� = name;
		this.���� = job;
		this.���� = age;
		this.���� = gender;
		System.out.println("int String String String ������");
	}
	// ���� 
	// this : �ڱ� �ڽ��� ����Ű�� �������� 
	Human(String �̸� , String ���� , int ����){
//		int a = 10;
//		a = a ; 
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		
		System.out.println("String String int ������");
	}
	Human(String name , int age , String job, String gender){
		this.�̸� = name;
		this.���� = age;
		this.���� = job;
		this.���� = gender;
	} 
	
	void �Ա�() {
		System.out.println("�ȳ� ���� �Ծ�� ");
	}
	void ���ϱ�() {
		System.out.println("������");
	}
	void ������() {
		System.out.println("�ľ� ~ �ľ�~");
	}
	void status() {
		System.out.println("�̸� : " + �̸�);
		System.out.println("���� : " + ����);
		System.out.println("���� : " + ����);
		System.out.println("���� : " + ����);
	}
}
