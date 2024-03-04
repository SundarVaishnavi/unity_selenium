package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class arraylist {
	
	public static void arraylistexample() {
		
		
		List<String>arraylist = new ArrayList<String>();
		arraylist.add("bmw");
		arraylist.add("maruthi");
		arraylist.add("benz");
		arraylist.add("hyundai");
		arraylist.add("hyundai");
		
		System.out.println(arraylist);
		System.out.println(arraylist.size());// To find size of the list we use size method
		System.out.println(arraylist.get(0));// To get particular value from the list we use get method
		//System.out.println(arraylist.indexOf("maruthi")); //To find index position of the list 
		//System.out.println(arraylist.lastIndexOf("hyundai"));// To find last index position of the list
		System.out.println(arraylist.add("kia"));//To add value to the list add method
		//System.out.println(arraylist.remove(0));// To remove particular value from the list using index position
		//System.out.println(arraylist.remove("hyundai"));// To remove particular value from the list using object
	   
		List<String>arraylist1 = new ArrayList<String>();
		arraylist1.addAll(arraylist);// To copy all value from one list to another list add all method
		System.out.println(arraylist1);
		//arraylist1.clear();
System.out.println(arraylist1);// To clear all value from the list
arraylist1.add("null");
System.out.println(arraylist1);
arraylist1.set(0,"mghector");
System.out.println(arraylist1);
System.out.println(arraylist1.isEmpty());

// using for each loop Iterate
for(String string: arraylist1) {
	System.out.println("using for eachloop:"+string);
}	
System.out.println("---------------------------------------------------");
	// using for loop iterate
	for(int i=0;i<arraylist1.size();i++) {
		System.out.println("using for loop:"+arraylist1.get(i));
	}
	System.out.println("-------------------------------------------------");
	
	ListIterator<String> listiterator = arraylist1.listIterator();
	while(listiterator.hasNext());
	System.out.println("forword iteration:"+listiterator.next());
}




		
		
		
	

	
	

	public static void main(String[] args) {
		
		arraylist n = new arraylist();
		n.arraylistexample();
		
		

	}

}
