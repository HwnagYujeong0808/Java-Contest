package day05;
// method Overloading
// �������� 
// ��� : �޼������̸� ���� , �Ű������� �ڷ���, ����, ������ �ٸ��� 

public class MethodEx5 {
	static int plus(int x, int y ) {
		return x+y;
	}
	static float plus(float x , int y) {
		return x+y;
	}
	static String plus(String x, String y) {
		return x+y;
	}
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		int result1 = plus (a, b);
		System.out.println("result1 : " + result1);
		
		float result2 = plus (100.0f, b);
		System.out.println("result2 : " + result2);
		
		String result3 = plus("������", "�ݿ���");
		System.out.println("result3 : " + result3);
		
		
		System.out.println("�����ε�");
		System.out.println(100);
		System.out.println(100.0f);
		System.out.println(100.0d);
		
	}
}
