package day06;

public class Monkey extends Mammal {
	
	Monkey(){
		eye = 2; nose=1 ; ear=2;
		name = "������"; species = "�����ڿ�����";
		System.out.println("������ �⺻ ������");
	}
	void eating(){
		System.out.println("�ٳ����� �����ؿ� �ȳ�");
	}
	void sleeping() {
		System.out.println("���� ������ ���� ��ϴ�.~~~");
	}
	void climbing() {
		System.out.println("������ �� Ÿ��");
	}

}
