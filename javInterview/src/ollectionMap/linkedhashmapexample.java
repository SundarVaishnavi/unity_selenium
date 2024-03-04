package ollectionMap;

import java.util.LinkedHashMap;

public class linkedhashmapexample {
	
	public void linked() {
		
		LinkedHashMap<Integer,String> l = new LinkedHashMap<Integer,String>();
	    l.put(1,"sundar");
		l.put(3,"vaishnavi");
		l.put(7,"kannan");
		l.put(9,"arya");
		l.put(22,"agni");
		l.put(4,"sivan");
		System.out.println(l);
		
		System.out.println("insertion order:"+l.entrySet());
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		linkedhashmapexample lm = new linkedhashmapexample();
		lm.linked();

	}

}
