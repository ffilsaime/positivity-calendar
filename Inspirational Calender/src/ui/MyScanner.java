package ui;

import java.util.Scanner;
import files.MonthsAndNumDays;

public class MyScanner {
	private int _monthNum;
	public MyScanner(){//creates questions for you to answer and stores the value you put in
		MonthsAndNumDays mAND = new MonthsAndNumDays();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of month you would like to see. "
				+ "If the number you enter is a single digit, please right only that digit ");
		System.out.print("An example of such would be this: ");
		System.out.println("I would enter 6 if I wanted to use the month of June. Not 06.");
		System.out.println("Write your answer: ");
		_monthNum = scan.nextInt();
		
		System.out.print("Is this the month you are looking for: ");
		mAND.getMonth(_monthNum-1);
		System.out.println("?");
		System.out.println("Please write: Yes or No");
		
		String s = scan.next();
		if(s.contains("no")||s.contains("No")){
			System.out.println("Please find the number of your month again.");
			
		}
		System.out.println("Thank you for answering this.");
		scan.close();		
	}
	public String getMonthName(){ //saves the name of the month chosen
		MonthsAndNumDays mAND = new MonthsAndNumDays();
		String name = mAND.getMonthString(_monthNum-1);
		return name; 	
	}
}
