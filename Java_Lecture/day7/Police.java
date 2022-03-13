package day07;
// 상속 : A is a B 
///      A has a B 

public class Police {
	String name;
	String rank;
	Gun g ; 

	public Police() {
		name = "포돌이"; 
		rank = "순경";
		g = null;
	}
	public Police(Gun g) {
		this.g = g;
	}
	public void use() {
		if (g != null ){
			g.fire();
		}
	}
	public void eating() {
		System.out.println("도넛을 맛나게 먹어요");
	}
	public void arrest() {
		System.out.println("당신의 묵비권.... ");
	}
}
