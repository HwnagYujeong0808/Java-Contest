package day05;

public class MethodEx6 {

	static int avg(int ... data) {
		// System.out.println("data : " + data);
		int sum =0 ;
		for (int i = 0 ; i<data.length;i++) {
			sum += data[i];
		}
		return sum/data.length;
	}
	
	public static void main(String[] args) {
		int result1 = avg(100,200);
		System.out.println("result1 : " + result1);
		
		int result2 = avg(100,200,300);
		System.out.println("result2 : " + result2);
		
		int result3 = avg(100,200,300,400);
		System.out.println("result3 : " + result3);
		
		int result4 = avg(100,200,300,400,100,200,4300,200,300,100,200);
		System.out.println("result4 : " + result4);
	}
}	
