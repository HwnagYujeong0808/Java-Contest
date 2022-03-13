package day06;

public class Medic {
	int hp, x, y , offensePower, defensePower, range;
	
	Medic(){
		hp = 80;
		x = 0 ; y = 0 ; offensePower = 0;  defensePower = 7;
		range = 4;
		
		System.out.println("메딕 기본생성자");
	}
	void heal(Marine x) {
		x.hp += 5;
		System.out.println("치료중....");
	}
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
	
}
