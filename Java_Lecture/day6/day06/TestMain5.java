package day06;

public class TestMain5 {
	public static void main(String[] args) {
		Marine m2 = new Marine();
		SiegeTank st = new SiegeTank();
		st.attack(m2);
		m2.status();
		SiegeTank st2 = new SiegeTank();
		st.attack(st2);
		
	}
	
	
	
}
