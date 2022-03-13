package day10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx6 {
	public static void main(String[] args)
								throws IOException {
		
		File f1 = new File("d:\\Hello.java"); 
		File f2 = new File("d:\\Hello6.java");
		
		// 파일에 접근해서 읽어오기 
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		
		// Buffer 를 사용 
		BufferedInputStream bis = 
					new BufferedInputStream(fis);
		
		BufferedOutputStream bos = 
				new BufferedOutputStream(fos); 
		
		// Buffer + File ==> bis 
		
		int value =0 ; 
		while((value = bis.read()) != -1) {
			System.out.print((char)value);
			bos.write(value);
		}
		bos.flush();
		
	}
}
