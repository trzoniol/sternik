package pl.sternik.kk.zadania.zad07;

import java.io.InputStream;
import java.util.Scanner;

public class MyScanner {

	Scanner scanner;
	
	public MyScanner(InputStream in) {
		scanner = new Scanner(in);
	}
	
	public int nextInt(){
		return scanner.nextInt();
	}
	
	public void close(){
		scanner.close();
	}

}
