package ui;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.io.File;
import java.util.Scanner;
//make it similar to Dr.Alphonce's code in lab 9
public class MyFileReader implements Iterator<String> {
	private Scanner _scanner;

	public MyFileReader(String filename){
		try {
			_scanner = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("I can't open the file named \""+filename+"\".");
		}
	}
	
	public boolean hasNext() {
		return _scanner.hasNextLine();
	}
	
	public String next() {
		return _scanner.nextLine();
	}
	
	public void close(){
		_scanner.close();
	}

}
