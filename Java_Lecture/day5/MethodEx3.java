package day05;
import java.util.Scanner; 
// call by value : 
public class MethodEx3 {
	static int hap(int a , int b) {
		int c = a + b; 
		System.out.println(
			" hap method ���� :  a : " + a + " b : " + b);
		a++;
		System.out.println(" methodEx3 ���ο��� a : " + a);
		return c;
//		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���");
		int b = sc.nextInt();
		System.out.println("�Է��� ���� : " +  a + " , " + b);
		int result1 = hap(a,b);
		System.out.println("result1 : " + result1);
		System.out.println(" main method  a : "+ a);
		
	}
}
