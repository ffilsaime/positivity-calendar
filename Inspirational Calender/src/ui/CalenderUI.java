package ui;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import files.Eventhandler;
import files.MonthsAndNumDays;
import javax.swing.JButton;

import ui.MyScanner;
import months.Month;


public class CalenderUI {

	private MonthsAndNumDays _mAND;
	private MyScanner _scan;
	private Month _mth;
	
	public CalenderUI(){
		_mth = new Month(this);
		_mAND= new MonthsAndNumDays();
		_scan= new MyScanner();
		
		JFrame window = new JFrame("Self-Love Calender: "+ _scan.getMonthName());// creates a window with the calendar and month name
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(7,5));
		window.add(buttons);
		
		for(int i= 1; i<=_mAND.getMaxNumberofDays(_scan.getMonthName()); i++){//creates the buttons according to month 
			JButton button = new JButton(Integer.toString(i));
			button.setEnabled(true);
			button.addActionListener(new Eventhandler(_mth));
			buttons.add(button);
		}
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}
// a method must be made so that when a button is pressed a new jframe pops up with the quote on it
}
