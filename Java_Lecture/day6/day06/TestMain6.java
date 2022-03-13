package day06;

public class TestMain6 {
	public static void main(String[] args) {
		
		Rabbit r = new Rabbit();
		r.eating();
		r.sleeping();
		r.jumping();
		System.out.println("-----------------------");
		Monkey m  = new Monkey();
		m.eating();
		m.sleeping();
		m.climbing();
		System.out.println("-----------------------");
		Whale w = new Whale();
		w.eating();
		w.sleeping();
		w.swimming();
				
		System.out.println("---------------------");
		//Mammal mm = new Mammal();
		//mm.eating();
		//mm.sleeping();
		
		Horse h = new Horse();
		h.eating();
		h.running();
		h.sleeping();
		
		
	}
}
