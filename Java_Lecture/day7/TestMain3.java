package day07;

public class TestMain3 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		//Child c2 = new Child();
		//c2 = c ;
		System.out.println("----------------");
		p = c; 
		// �θ��� ���������� �ڽ��� �������� ��� ���� ���������� ���� 
		// c = p;  XXX 
		p.eating();
		p.singing();
		p.nagging();
		// p.goClub();
		// Parent Ŭ������ �����ϴ� ������ �޼��常 ���� ����
		Child c2 = new Child();
		System.out.println(" P : "+ p);
		System.out.println(" c : " + c);
		c2 = c;
		System.out.println(" c2 :" + c2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
