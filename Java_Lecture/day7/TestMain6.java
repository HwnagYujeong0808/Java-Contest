package day07;

public class TestMain6 {
	public static void main(String[] args) {
		Police p = new Police();
		p.eating();
		//p.fire();
		Gun g = new Gun();
		Police p2 = new Police(g);
		p2.use();
		
		
	}
}
