package day06;

// 1. member field
// 2. constructor
// 3. member method 
public class Person {
	int age;
	String name , gender, job; 
	// �⺻�����ڰ� 1�� �����ϴ� ������ ����
	Person(){
		// ��ü�� �ʱ�ȭ�� ��� 
		// class �̸��� �������̸� 
		// ���ϰ��� ���� �޼��� , ����Ű���� X 
		// void Ű���� ������� �ʴ´�. 
		// �⺻�����ڴ� ��������� �⺻���� �Ҵ�
		age = 27;
		name = "IU";
		gender = "��";
		job = "����/���";
		
		System.out.println("�⺻������ ȣ��... ");
	}
	Person(String name , int age , String job, String gender ){
		this(age, name, job);  // ù��° ���ο� �;���.
//		this.name = name;   this() <--
		//                  this(age, name) 
//		this.age = age;
//		this.job = job;
		this.gender = gender;
		System.out.println(
				"String int String String �Ű����� ������");
	}
	Person(int age , String name , String job){
		this();  // �⺻������ ȣ��
		this.age = age;
		this.name = name;
		this.job = job;
		System.out.println("int String String ������");
	}
	void eating(String it) {
		System.out.println(
				it + "��/�� �Ծ��");
	}
	void talk() {
		System.out.println("�ӴڼӴ�");
	}
	void status() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("���� : " + this.job);
		System.out.println("���� : " + this.gender);
	}
}
