package day06;

public class SiegeTank {
	int hp, x, y;
	int range, movespeed ;
	int offensePower , defensePower;
	boolean mode;
	SiegeTank(){
		hp = 200;
		x =0 ; 
		y = 0 ;
		range = 10;
		movespeed = 2;
		offensePower = 9;
		defensePower = 5;
		mode = false; // �̵����� ���� 
		System.out.println("�⺻ ������");
	}
	void changeMode() {
		if( mode) {
			mode = false;
			System.out.println("�̵� ����");
		} 
		else {
			mode = true;
			System.out.println("���� ��� ���� ");
		}
	}
	void move(int x, int y) {
		System.out.println(
				"("+x +  " , " + y + ") �� �̵��մϴ�.");
	}
	void stop() {
		System.out.println("����...");
	}
	void patrol() {
		System.out.println("������...");
	}
	void status() {
		System.out.println("------------");
		System.out.println("ü�� : "+ hp);
		System.out.println(" x : " + x);
		System.out.println(" y : " + y);
	}
	
}
