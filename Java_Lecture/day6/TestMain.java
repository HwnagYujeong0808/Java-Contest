package day06;

public class TestMain {
	public static void main(String[] args) {
		// ��ü ���� 
		Person p = new Person();
		
		//p.age = 20;
		System.out.println(p.age);
		// eating() ȣ��
		p.eating("���κ��");
		
		// talk() ȣ�� 
		p.talk();
		
		p.status();
		//////////////////////////// 
		//  30 �� ȫ�浿 �ǻ� �� 
		Person p2 = new Person();
		p2.age = 30;
		p2.name = "ȫ�浿";
		p2.job = "�ǻ�";
		p2.gender="��";
		p2.status();
		
		System.out.println("--------------------");
		Person p3 = new Person("ȫ�浿",30,"�ǻ�", "��");
		p3.status();
		System.out.println("--------------------");
		Person p4 = new Person(24,"�л�", "�����");
		p4.status();
		
	}
}
