package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) 
						throws IOException {
		
		byte[] b = {'j','a','v','a'};
		
		File f = new File("d:\\javaout.txt");
		
		FileOutputStream fos = 
				new FileOutputStream(f);
		
		fos.write(b);
		
	}
}
