package day06;

public class TestMain3 {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		System.out.println(m2);
		m1.attack(m2);
		System.out.println(
		"m2.hp : "+ m2.hp);
		
		Marine m3 = new Marine(500); // ü�� 500¥�� ���������
		// ���� �ڵ尡 �����ϵ��� Marine Ŭ���� �ڵ带 �߰��ϼ��� 
		m3.status();
		
//		m1.status();
//		m1.move(100,100);
//		m1.attack();
//		m1.steampack();
//		m1.steampack();
//		m1.steampack();
//		m1.steampack();
//		m1.steampack();
//		m1.status();
		
		
	}
}
