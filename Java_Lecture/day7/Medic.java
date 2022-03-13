package day06;

public class Medic extends Terran{
	
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
	
	
}
