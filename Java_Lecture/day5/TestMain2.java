package day05;

public class TestMain2 {
	public static void main(String[] args) {
		// ȫ�浿
		Human h1 = new Human();
		h1.status();
		System.out.println("------------------");
		h1.�̸� = "ȫ�浿";
		h1.���� = "����";
		h1.���� = 20;
		h1.���� = "��";
		h1.status();
		// h2 : �Ż��Ӵ�
		// ��ü�� ����� 
		Human h2 = new Human();
		// ���� �ʱ�ȭ 
		h2.���� = 30;
		h2.�̸� = "�Ż��Ӵ�"; 
		h2.���� = "��"; 
		h2.���� = "ȭ��"; 
		// �������� ��� 
		h2.status();
		
		
	}
}
