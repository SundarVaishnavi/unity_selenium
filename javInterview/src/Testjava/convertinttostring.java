package Testjava;

import java.util.ArrayList;
import java.util.Iterator;

public class convertinttostring {
	
	
	public void iterator() {
		ArrayList<String> as = new ArrayList<String>();
		as.add("sundar");
		as.add("balaji");
		
		Iterator<String> is = as.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
	}

	public static void main(String[] args) {
		
		convertinttostring is = new convertinttostring();
is.iterator();

	}

}
