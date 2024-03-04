package String.java;

public class stringBuffer {

	public static void main(String[] args) {
		
		// string
		System.out.println(" string is immutable object");
		String s1 = "sundar";
		System.out.println(" add last name:"+s1.concat("balaji"));
		System.out.println(s1);
		
		// string buffer
		
		System.out.println(" string is immutable object");
		StringBuffer s2 = new StringBuffer("sundar");
		System.out.println("add last name:"+s2.append("balaji"));
		System.out.println(s2);
		
		// stringBuffer methods
		// reverse, replacethis , insert,delete, capacity
		// reverse
	//	System.out.println("reverse string buffer:"+s2.reverse());
		//replace this
		//System.out.println("replace word:"+s2.replace(0, 0, "k."));
		//System.out.println("insert:"+s2.insert(5,"vadivelan"));
		// capacity
		System.out.println("find string capcity:"+s2.capacity());

	}

}
