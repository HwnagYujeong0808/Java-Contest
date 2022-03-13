package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("d:\\Hello.java");
		
		FileInputStream fis = new FileInputStream(f);
		
		int value = 0;
		
		while(    (value = fis.read()) != -1  ) {
			//char c = (char)value;
			System.out.print((char)value);
		}
		
	}
}
