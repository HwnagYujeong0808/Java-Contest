package day06;

public class TestMain7 {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic me = new Medic();
		SiegeTank st = new SiegeTank();
		
		m1.attack(m2);
		m2.status();
		System.out.println("----------------------");
		me.heal(m2);
		m2.status();
		
		m1.attack(st);
		m1.attack(me);
		
		
		
		
	}
}
