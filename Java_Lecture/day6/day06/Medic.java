package day06;

public class Medic {
	int hp, x, y , offensePower, defensePower, range;
	
	Medic(){
		hp = 80;
		x = 0 ; y = 0 ; offensePower = 0;  defensePower = 7;
		range = 4;
		
		System.out.println("�޵� �⺻������");
	}
	void heal(Marine x) {
		x.hp += 5;
		System.out.println("ġ����....");
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
	
}
