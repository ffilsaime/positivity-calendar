package files;

import java.util.ArrayList;

public class MonthsAndNumDays {
	private ArrayList<String> _months;


	public MonthsAndNumDays() { //creates an arraylist of string containing month names
		_months = new ArrayList<String>();
		_months.add(0, "January");
		_months.add(1, "February");
		_months.add(2, "March");
		_months.add(3, "April");
		_months.add(4, "May");
		_months.add(5, "June");
		_months.add(6, "July");
		_months.add(7, "August");
		_months.add(8, "September");
		_months.add(9, "October");
		_months.add(10, "November");
		_months.add(11, "December");

//		_numDays = new ArrayList<Integer>();
//		for (int n = 1; n <= 31; n++) {
//			_numDays.add(n, n);
//		}
	}
	
	public void getMonth(int monthnum){ // gets the name of the month according to its place in the year
			System.out.print(_months.get(monthnum));
	}
	
	public String getMonthString(int monthnum){ // gets the name of the month according to its place in the year
		return _months.get(monthnum);
}

	public Integer getMaxNumberofDays(String month){ //gets the max number of days to create buttons
		int x = 0;
		if(month.contains("January")){
			x = 31;
		}
		if(month.contains("February")){
			x = 28;
		}
		if(month.contains("March")){
			x = 31;
		}
		if(month.contains("April")){
			x = 30;
		}
		if(month.contains("May")){
			x = 31;
		}
		if(month.contains("June")){
			x = 30;
		}
		if(month.contains("July")){
			x = 31;
		}
		if(month.contains("August")){
			x = 31;
		}
		if(month.contains("September")){
			x = 30;
		}
		if(month.contains("October")){
			x = 31;
		}
		if(month.contains("November")){
			x = 30;
		}
		if(month.contains("December")){
			x = 31;
		}
		return x;
	}

	
}
