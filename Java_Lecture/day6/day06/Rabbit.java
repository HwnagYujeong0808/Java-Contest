package day06;

public class Rabbit extends Mammal {
	
	Rabbit(){
		eye = 2; nose=1 ; ear=2;
		name = "�䳢"; species = "�Ӱ��";
		System.out.println("�䳢 �⺻ ������");
	}

	void eating(){
		System.out.println("����� �����ؿ� �ȳ�");
	}
	void sleeping() {
		System.out.println("Ǯ���� ���� ���� ~~~");
	}
	
	void jumping() {
		System.out.println("���ѱ��� �پ�� ");
	}
}
