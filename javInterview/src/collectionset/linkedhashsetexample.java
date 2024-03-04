package collectionset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashsetexample {

	
	public void linked() {
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("sundar");
		ls.add("balaji");
		ls.add("vaishnavi");
		ls.add("kannan");
		ls.add("ravi");
		ls.add("jeeva");
		
		System.out.println(ls.contains("kannan"));
		System.out.println(ls);
		
}
	
	
	public void iterator() {
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("sundar");
		ls.add("balaji");
		ls.add("vaishnavi");
		ls.add("kannan");
		ls.add("ravi");
		ls.add("jeeva");
		
		Iterator<String> is = ls.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
			
		}
		
		
	
	
	public static void main(String[] args) {
		linkedhashsetexample l1 = new linkedhashsetexample();
		l1.linked();
		l1.iterator();

	}

}
