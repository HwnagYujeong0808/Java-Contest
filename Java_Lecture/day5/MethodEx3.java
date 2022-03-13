package day05;
import java.util.Scanner; 
// call by value : 
public class MethodEx3 {
	static int hap(int a , int b) {
		int c = a + b; 
		System.out.println(
			" hap method 내부 :  a : " + a + " b : " + b);
		a++;
		System.out.println(" methodEx3 내부에서 a : " + a);
		return c;
//		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요");
		int b = sc.nextInt();
		System.out.println("입력한 수는 : " +  a + " , " + b);
		int result1 = hap(a,b);
		System.out.println("result1 : " + result1);
		System.out.println(" main method  a : "+ a);
		
	}
}
