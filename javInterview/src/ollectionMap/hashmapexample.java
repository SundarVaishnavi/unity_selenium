package ollectionMap;

import java.util.HashMap;
import java.util.Map;

public class hashmapexample {
	
	public void hmap() {
		HashMap<Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1,"sundar");
		hm.put(8,"vaishnavi");
		hm.put(7,"kannan");
		hm.put(4,"arya");
		hm.put(3,"agni");
		hm.put(6,"sivan");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		
		// put method to add element
		
		
		Map<Integer,String> m1 = new  HashMap<Integer,String>(); 
		m1.putAll(hm);
		System.out.println("Copy all value from existing map to new map:"+m1);
		
		m1.clear();
System.out.println(m1);

System.out.println(" key present are not:"+hm.containsKey(2));

// To check value present are  not
System.out.println("Value present are not:"+hm.containsValue("geetha"));

// To clone map
System.out.println(" clone map:"+hm.clone());

// map is empty
System.out.println(" is empty:"+hm.isEmpty());

// pick all keys
System.out.println(" pick key:"+hm.keySet());

// fetch a value
System.out.println("fetch value:"+hm.get(1));

// fetch all the value
System.out.println(" fetch all the value:"+hm.values());

// entryset
System.out.println(hm.entrySet());
		
	}

	public static void main(String[] args) {
		
		hashmapexample hm1 = new hashmapexample();
		hm1.hmap();
	}

}
