package day10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx5 {
	public static void main(String[] args)
							throws IOException {
		File f = new File("d:\\Hello.java");
		File f2 = new File("d:\\Hello4.java");
		
		FileReader fr = new FileReader(f); 
		FileWriter fw = new FileWriter(f2);
		
		int value = 0;
		while( (value = fr.read()) != -1) {
			System.out.print((char)value);
			fw.write(value);
		}
		fw.flush();
		
	}
}
