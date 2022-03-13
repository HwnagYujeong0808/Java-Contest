package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) 
						throws IOException {
		File f1 = new File("d:\\Hello.java"); 
		File f2 = new File("d:\\Hello3.java");
		
		// 파일에 접근해서 읽어오기 
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		
		int value =0 ; 
		while((value = fis.read()) != -1) {
			System.out.print((char)value);
			fos.write(value);
		}
		
	}
}
