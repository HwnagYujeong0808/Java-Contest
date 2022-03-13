package day10;

import java.io.IOException;

public class IOEx7 {
	public static void main(String[] args) throws IOException {
		//System.in.read();
		System.out.println("Á¾·á : ctl+z");
		int value =0 ; 
		while((value = System.in.read()) != -1) {
			System.out.print((char)value);
		}
		
	}
}
