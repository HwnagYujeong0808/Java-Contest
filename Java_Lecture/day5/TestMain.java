package day05;

public class TestMain {
	public static void main(String[] args) {
		// float[] m ; 
		// �ڷ��� ������
		// class : ����� ���� �ڷ���
		Car c ; 
		c = new Car();
		System.out.println("c : "+ c);
		System.out.println(c.��);
		System.out.println(c.�ڵ�);
		System.out.println(c.����);
		System.out.println(c.������);
		c.���� = "�׽��� ��3";
		c.������ = "�׽���"; 
		c.�� = 4;
		c.�ڵ� = 1;
		System.out.println("-------------------");
		System.out.println(c.��);
		System.out.println(c.�ڵ�);
		System.out.println(c.����);
		System.out.println(c.������);
		
		c.����();
		c.����();
		c.����();
		c.����();
		c.����();
		
		
		Car c2 = new Car();
		System.out.println(c2.��);
		System.out.println(c2.�ڵ�);
		System.out.println(c2.����);
		System.out.println(c2.������);
		
		
		
	}
}
