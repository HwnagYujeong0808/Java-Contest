package day06;

public class Terran {
	int hp, x, y;
	int range, movespeed ;
	int offensePower , defensePower;
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
