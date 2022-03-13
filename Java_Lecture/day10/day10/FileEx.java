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
			System.out.println("������ �����մϴ�.");
		}else {
			System.out.println("������ �����մϴ�.");
		}
		
		String path = f.getAbsolutePath();
		System.out.println(path);
		
		if(f.isFile()) {
			System.out.println("�����Դϴ�.");
		}
		if(f.isDirectory()) {
			System.out.println("���丮�Դϴ�.");
		}
		File f2 = new File("d:\\dev\\eclipse");
		if(f2.isDirectory()) {
			System.out.println("���丮 ����");
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
