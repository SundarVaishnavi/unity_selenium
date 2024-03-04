package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Listarray {
	
	public void iterator() {
		List<String>array = new ArrayList<String>();
		array.add("sundar");
		array.add("vaishnavi");
		array.add("balaji");
		array.add("kannan");
		array.add("saranya");
		array.add("ajith");
		
		System.out.println("------------for each loop-----");
		for(String string :array) {
			System.out.println(string);
		}
		System.out.println("---------for loop------------");
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		System.out.println("----------listiterator-------");
		ListIterator<String> list = array.listIterator();
		while(list.hasNext()) {
		System.out.println(list.next());
		
		}
		System.out.println("-----previous------");
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
		
		System.out.println("using iterator print in forward");
		Iterator<String> iterator = array.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

	public static void main(String[] args) {
		
Listarray list = new Listarray();
list.iterator();
	}

}
