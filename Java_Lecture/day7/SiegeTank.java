package day06;

public class SiegeTank extends Terran{
	
	boolean mode;
	SiegeTank(){
		hp = 200;
		x =0 ; 
		y = 0 ;
		range = 10;
		movespeed = 2;
		offensePower = 9;
		defensePower = 5;
		mode = false; // �̵����� ���� 
		System.out.println("�⺻ ������");
	}
	void changeMode() {
		if( mode ) {
			mode = false;
			System.out.println("�̵� ����");
		} 
		else {
			mode = true;
			System.out.println("���� ��� ���� ");
		}
	}
	
	
	
}
