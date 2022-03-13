package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx8 {
	public static void main(String[] args) throws IOException {
		System.out.println("Á¾·á (ctl+z) : ");
		
		InputStreamReader isr = 
				new InputStreamReader(System.in);
		
		BufferedReader br = 
				new BufferedReader(isr); 
		
		String data = null;
		
		FileWriter fw = new FileWriter("d:\\msg.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
		
		while( (data = br.readLine()) != null ) {
			System.out.println(data);
			bw.write(data +"\n");
		}
		bw.flush();
		
		
	}
}
