package hour12;

import java.util.Collections;
import java.util.Vector;

public class StringListener {
	
	String[] names = { "Spanky", "Alfalfa", "Buckwheat", "Daria", "Stymie", "Marianne",
			"Scotty", "Tommy", "Chubby" };
	
	public StringListener(String[] moreNames){
		Vector<String> list = new Vector<String>();
		for(int i = 0; i < names.length; i++){
			list.add(names[i]);
		}//end for
		
		for(int i = 0; i < moreNames.length; i++){
			list.add(moreNames[i]);
		}//end for
		
		Collections.sort(list);
		for(String name : list){
			System.out.println(name);
		}//end for
		
	}//end StringListener

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringListener listener = new StringListener(args);

	}

}
