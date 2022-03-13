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
		mode = false; // 이동가능 상태 
		System.out.println("기본 생성자");
	}
	void changeMode() {
		if( mode) {
			mode = false;
			System.out.println("이동 가능");
		} 
		else {
			mode = true;
			System.out.println("시즈 모드 상태 ");
		}
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
	void status() {
		System.out.println("------------");
		System.out.println("체력 : "+ hp);
		System.out.println(" x : " + x);
		System.out.println(" y : " + y);
	}
	
}
