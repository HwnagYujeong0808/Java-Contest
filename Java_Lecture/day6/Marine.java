package day06;

public class Marine {
	int hp, x, y;
	int range, movespeed ;
	int offensePower , defensePower;
	
	Marine(){
		hp = 100;
		x = 0; 
		y = 0 ;
		offensePower = 5;
		defensePower = 1;
		range = 5;
		movespeed = 3;
		System.out.println("���� �⺻������");
	}
	
	void attack() {
		System.out.println("�ѶѶѶ�~~");
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
	void steampack() {
		System.out.println("������ �����...");
	}
	void status() {
		System.out.println("------------");
		System.out.println("ü�� : "+ hp);
		System.out.println(" x : " + x);
		System.out.println(" y : " + y);
	}
}
