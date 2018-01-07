package files;

import months.Month;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventhandler implements ActionListener{
	
	private Month _rndsnt; 
	
	public Eventhandler(Month mth){
		_rndsnt = mth;
	}
	@Override 
	public void actionPerformed(ActionEvent e){
		System.out.println(_rndsnt.randomQuotes());
		System.out.println("");
	}

}
