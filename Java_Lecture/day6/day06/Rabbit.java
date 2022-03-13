package day06;

public class Rabbit extends Mammal {
	
	Rabbit(){
		eye = 2; nose=1 ; ear=2;
		name = "Åä³¢"; species = "¾Ó°í¶ó";
		System.out.println("Åä³¢ ±âº» »ı¼ºÀÚ");
	}

	void eating(){
		System.out.println("´ç±ÙÀ» ÁÁ¾ÆÇØ¿ä ³È³È");
	}
	void sleeping() {
		System.out.println("Ç®À§¿¡ ´©¿ö ÄğÄğ ~~~");
	}
	
	void jumping() {
		System.out.println("±øÃÑ±øÃÑ ¶Ù¾î¿ä ");
	}
}
