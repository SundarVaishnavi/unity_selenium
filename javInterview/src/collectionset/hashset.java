package collectionset;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	
	public void hashsetexample() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("sundar");
		hs.add("balaji");
		hs.add("radnus");
		hs.add("sundar");
		hs.add("null");
		hs.add("kannan");
		System.out.println(hs);
		hs.add("jeeva");
		System.out.println(hs);
		
		System.out.println("remove"+hs.remove("balaji"));
		System.out.println(hs);
		
		
	}
	
	public void iterator() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("sundar");
		hs.add("balaji");
		hs.add("radnus");
		hs.add("sundar");
		hs.add("null");
		hs.add("kannan");
		
		Iterator<String> is = hs.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		
	}
	public void foreach() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("sundar");
		hs.add("balaji");
		hs.add("radnus");
		hs.add("sundar");
		hs.add("null");
		hs.add("kannan");
		
		for( String string :hs) {
			System.out.println(string);
		}
		
	
	}
	public static void main(String[] args) {
		hashset h1 = new hashset();
		h1.hashsetexample();
		h1.iterator();
		h1.foreach();
	}

}
