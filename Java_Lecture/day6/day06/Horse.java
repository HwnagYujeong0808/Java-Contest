package day06;

public class Horse extends Mammal {
	
	Horse(){
		System.out.println("�� ������ ");
	}
	
	void running() {
		System.out.println("�� �޸���..~~~");
	}
	// �������̵� �޼����
	// �Ϲ� �޼��� ����
	// annonation
	
	@Override
	void eating() {
		System.out.println("������ �����ؿ�");
	}
	@Override
	void sleeping() {
		System.out.println("���������� ��ϴ�.");
	}
	
}
