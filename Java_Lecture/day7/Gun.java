package day07;

public class Gun {
	int bullet;
	Gun(){
		bullet = 6;
	}
	public void fire() {
		if (bullet >1) {
			bullet--;
			System.out.println("��~~~ ") ;
		}else {
			System.out.println("ƽ~~~");
		}
	}
	public void reload() {
		bullet = 6;
		System.out.println("öĿ��..");
	}
	
}
