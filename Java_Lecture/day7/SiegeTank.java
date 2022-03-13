package day06;

public class SiegeTank extends Terran{
	
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
		if( mode ) {
			mode = false;
			System.out.println("이동 가능");
		} 
		else {
			mode = true;
			System.out.println("시즈 모드 상태 ");
		}
	}
	
	
	
}
