package day06;

public class Terran {
	int hp, x, y;
	int range, movespeed ;
	int offensePower , defensePower;
	void move(int x, int y) {
		System.out.println(
				"("+x +  " , " + y + ") 로 이동합니다.");
	}
	void stop() {
		System.out.println("정지...");
	}
	void patrol() {
		System.out.println("순찰중...");
	}
	void status() {
		System.out.println("------------");
		System.out.println("체력 : "+ hp);
		System.out.println(" x : " + x);
		System.out.println(" y : " + y);
	}
}
