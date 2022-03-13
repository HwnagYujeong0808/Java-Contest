package day10;
// I/O 
// java.io.* ; 

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) 
							throws IOException {
		File f = new File("d:\\Hello2.java");
		
		System.out.println(f.exists());
		
		if(!f.exists()) {
			f.createNewFile();
			System.out.println("파일을 생성합니다.");
		}else {
			System.out.println("파일이 존재합니다.");
		}
		
		String path = f.getAbsolutePath();
		System.out.println(path);
		
		if(f.isFile()) {
			System.out.println("파일입니다.");
		}
		if(f.isDirectory()) {
			System.out.println("디렉토리입니다.");
		}
		File f2 = new File("d:\\dev\\eclipse");
		if(f2.isDirectory()) {
			System.out.println("디렉토리 맞음");
			String[] list = f2.list();
			for (String x : list) {
				System.out.println(x);
			}
		}
		
		// String str = "hello\next";
		// System.out.println(str);
		// "c:\\test.txt"
	}
}
