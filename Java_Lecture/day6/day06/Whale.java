package day06;

public class Whale extends Mammal{

	
	Whale(){
		eye = 2; nose=1 ; ear=2;
		name = "��"; species = "Ȥ���";
		System.out.println("�� �⺻ ������");
	}
	void eating(){
		System.out.println("���츦 �����ؿ� �ȳ�");
	}
	// ������ : method overriding
	void sleeping() {
		System.out.println("�ٴ����� ���� ���� ~~~");
	}
	void swimming() {
		System.out.println("���ġ�� �� ");
	}
}
