package months;

import java.util.ArrayList;
import java.util.Random;
import ui.MyFileReader;
import ui.CalenderUI;

public class Month {
// must have the quotes from the filereader transferred to this class through an arraylist
	private ArrayList<String>_dipquotes;
	private CalenderUI _cui;
	
	public Month(CalenderUI cui){
		_cui = cui;
		_dipquotes = new ArrayList<String>();
		readTextFile("Important/quotes");
	}
	
	public ArrayList<String> readTextFile(String file){
		ArrayList<String> quotes = new ArrayList<String>(); 
		MyFileReader fileReader = new MyFileReader(file);
		while (fileReader.hasNext()){
			quotes.add(fileReader.next());
		}
		_dipquotes.addAll(quotes);
		return _dipquotes;
	}
	
	public String randomQuotes(){
		Random rnd = new Random();
		return _dipquotes.get(rnd.nextInt(_dipquotes.size()));
	}
	
	public void testingList(){
			for(int i = 0; i<_dipquotes.size(); i++){
				System.out.println(_dipquotes.get(i));
		}
	}
}
