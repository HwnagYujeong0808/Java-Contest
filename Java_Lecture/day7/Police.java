package day07;
// ��� : A is a B 
///      A has a B 

public class Police {
	String name;
	String rank;
	Gun g ; 

	public Police() {
		name = "������"; 
		rank = "����";
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
		System.out.println("������ ������ �Ծ��");
	}
	public void arrest() {
		System.out.println("����� �����.... ");
	}
}
