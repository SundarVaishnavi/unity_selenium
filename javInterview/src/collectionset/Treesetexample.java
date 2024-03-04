package collectionset;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetexample {

	
	public void tree() {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(2);
		ts.add(9);
		ts.add(7);
		ts.add(5);
		ts.add(11);
		ts.add(22);
		ts.add(87);
		ts.add(72);
		ts.add(72);
		System.out.println(ts);
		System.out.println(ts.contains(11));
		System.out.println(ts);
		System.out.println(ts.remove(5));
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.add(4));
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println("first element:"+ts.first());
		System.out.println("last element:"+ts.last());
		System.out.println("value lesser than given value:"+ts.headSet(7));
		System.out.println("value equal to higher than given value:"+ts.tailSet(7));
		System.out.println("picking inbetween value:"+ts.subSet(2, 87));
		System.out.println("comparator return null if sorting order default in natural order"+ts.comparator());
		System.out.println("descending order set:"+ts.descendingSet());
		System.out.println("firstpoll:"+ts.pollFirst());
		System.out.println("polllast:"+ts.pollLast());
		
}
	public void descendingit() {
		
TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(2);
		ts.add(9);
		ts.add(7);
		ts.add(5);
		ts.add(11);
		ts.add(22);
		ts.add(87);
		ts.add(72);
		ts.add(72);
		
		Iterator<Integer> di = ts.descendingIterator();
		while(di.hasNext()) {
			System.out.println(di.next());
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Treesetexample t1 = new Treesetexample();
		t1.tree();
		t1.descendingit();
	}

}
