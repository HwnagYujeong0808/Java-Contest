package day06;

public class TestMain4 {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		m1.attack(m2);
		m2.status();
		System.out.println("----------------------");
		Medic me = new Medic();
		me.heal(m2);
		m2.status();
		
		
		
	}
}
