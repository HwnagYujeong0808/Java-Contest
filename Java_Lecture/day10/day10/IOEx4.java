package day10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOEx4 {
	public static void main(String[] args) throws IOException {
		File f = new File("d:\\Hello.java");
		
		FileReader fr = new FileReader(f); 
		
		int value = 0;
		while( (value = fr.read()) != -1) {
			System.out.print((char)value);
		}
		
		
	}
}
