package day05;

public class TestMain3 {
	public static void main(String[] args) {
		Human h1 = new Human();
//		h1.�̸� = "������"; 
//		h1.����  = 22;
//		h1.���� = "��";
//		h1.���� = "�л�"; 
		h1.status();
		System.out.println("-------------------");
		Human h2 = new Human(22, "������", "�л�", "��");
		h2.status();
		System.out.println("-------------------");
		Human h3 = new Human("�Ʊ���", "���", 1);
		h3.status();
		Human h4 = new Human("ȫ���",20,"����","��" );
		h4.status();
		// this. Ű���� ��� 
		
		
	}
}
