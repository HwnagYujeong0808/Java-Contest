package day06;

public class Marine {
	int hp, x, y;
	int range, movespeed ;
	int offensePower , defensePower;
	Marine(int hp){
		this();
		this.hp = hp;
	}
	Marine(){
		hp = 100;
		x = 0; 
		y = 0 ;
		offensePower = 5;
		defensePower = 1;
		range = 5;
		movespeed = 3;
		System.out.println("¸¶¸° ±âº»»ý¼ºÀÚ");
	}
	
	void attack() {
		System.out.println("¶Ñ¶Ñ¶Ñ¶Ñ~~");
	}
	void attack(Marine x) {
		System.out.println(
			"attack method ³»ºÎ : X : " + x);
		//System.out.println(" x. hp : " + x.hp);
		x.hp -= offensePower;
		//System.out.println(" x. hp : " + x.hp);
	}
	
	void move(int x, int y) {
		System.out.println(
				"("+x +  " , " + y + ") ·Î ÀÌµ¿ÇÕ´Ï´Ù.");
	}
	void stop() {
		System.out.println("Á¤Áö...");
	}
	void patrol() {
		System.out.println("¼øÂûÁß...");
	}
	void steampack() {
		hp -= 3;
		movespeed += 3;
		System.out.println("½ºÆÀÆÑ »ç¿ëÁß...");
	}
	void status() {
		System.out.println("------------");
		System.out.println("Ã¼·Â : "+ hp);
		System.out.println(" x : " + x);
		System.out.println(" y : " + y);
	}
}
