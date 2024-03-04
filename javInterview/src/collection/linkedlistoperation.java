package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlistoperation {
	
	
	
	public void linkedlistexample() {
		LinkedList<Integer>linked = new LinkedList<Integer>();
		linked.add(22);
		linked.add(23);
		linked.add(22);
		linked.add(24);
		linked.add(26);
		linked.add(44);
		System.out.println(linked);
		
		System.out.println(linked.add(55));
		System.out.println(linked);
		
		linked.addFirst(57);
		System.out.println(linked);
		
	linked.addLast(98);
	System.out.println(linked);
	
	System.out.println("get first value:"+linked.getFirst());
	System.out.println("get last value:"+linked.getLast());
	System.out.println("Remove first value:"+linked.removeFirst());
	System.out.println(linked);
	System.out.println("Remove last:"+linked.removeLast());
	System.out.println(linked);
	System.out.println("poll will delete the first element:"+linked.poll());
	System.out.println(linked);
	
	System.out.println("firstpoll:"+linked.pollFirst());
	System.out.println(linked);
	System.out.println("lastpoll:"+linked.pollLast());
	System.out.println(linked);
	linked.removeFirstOccurrence(4);
	System.out.println("remove firstoccurance:"+linked);
	}
	
	public void linkedlistforeachexample() {
		LinkedList<Integer>linked = new LinkedList<Integer>();
		linked.add(22);
		linked.add(23);
		linked.add(22);
		linked.add(24);
		linked.add(26);
		linked.add(44);
		
		System.out.println("=============foreach=================");
		for(Integer string:linked) {
			System.out.println(string);
			
		}
		}

	
	
	public void linkedlistforloopexample() {
		LinkedList<Integer>linked = new LinkedList<Integer>();
		linked.add(22);
		linked.add(23);
		linked.add(22);
		linked.add(24);
		linked.add(26);
		linked.add(44);
		System.out.println("=========forloop==============");
		for(int i=0;i<linked.size();i++) {
			System.out.println(linked.get(i));
		}
		
		
	}
	
	public void linkedllistiterator() {
		LinkedList<Integer>linked = new LinkedList<Integer>();
		linked.add(22);
		linked.add(23);
		linked.add(22);
		linked.add(24);
		linked.add(26);
		linked.add(44);
		System.out.println("=========listiterator==============");
		ListIterator<Integer> li = linked.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}
	
	public void iterator() {
		LinkedList<Integer>linked = new LinkedList<Integer>();
		linked.add(22);
		linked.add(23);
		linked.add(22);
		linked.add(24);
		linked.add(26);
		linked.add(44);
		System.out.println("=========iterator==============");
		Iterator<Integer> li = linked.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}
	
	public static void main(String[] args) {
		
		linkedlistoperation l1 = new  linkedlistoperation();
		l1.linkedlistexample();
		l1.linkedlistforeachexample();
		l1.linkedlistforloopexample();
		l1.linkedllistiterator();
		l1.iterator();

	}

}
