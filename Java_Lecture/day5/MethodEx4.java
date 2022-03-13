package day05;

public class MethodEx4 {	
	static int getMaxValue(int[] x){
		System.out.println("getMaxValue method x : " + x);
		int maxValue = 0;
		for (int i= 0; i<x.length;i++) {
			if(maxValue < x[i])
				maxValue = x[i];
		}
		return maxValue;
	}
	static int getMaxValuePosition(int[] x) {
		int pos = -1; // 초기값 
		int maxValue = 0;
		for (int i= 0; i<x.length;i++) {
			if(maxValue < x[i]) {
				maxValue = x[i];
				pos = i;
			}
		}
		return pos;
	}
	
	
	
	// 2 : call by reference 
	public static void main(String[] args) {
		int[] m = { 25 , 35, 22, 11, 10,9,8,6,17 };
		//System.out.println(m.length);
		System.out.println("main method : " + m);
		System.out.println(
				"배열요소중 가장 큰값 : " + getMaxValue(m));
		//최대값의 위치를 리턴하는 getMaxValuePosition()
		System.out.println(
			"배열요소중 최대값의 위치 : " + getMaxValuePosition(m));
		System.out.println("m[2] : " + m[2]);
		setValue(m, 2, 5);
		System.out.println("m[2] : " + m[2]);
	}
	static void setValue(int[] x ,int pos,int value) {
		x[pos] = value;
	}
}
