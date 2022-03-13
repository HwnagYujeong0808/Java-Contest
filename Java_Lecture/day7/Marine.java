package day06;

public class Marine extends Terran{
	
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
	void attack(Terran x) {
		//Terran x = new Marine();
		
		System.out.println(
			"attack method ³»ºÎ : X : " + x);
		//System.out.println(" x. hp : " + x.hp);
		x.hp -= offensePower;
		//System.out.println(" x. hp : " + x.hp);
	}
	
	void steampack() {
		hp -= 3;
		movespeed += 3;
		System.out.println("½ºÆÀÆÑ »ç¿ëÁß...");
	}
	
}
