package String.java;

import java.util.stream.IntStream;

public class stringmethod {

	public static void main(String[] args) {
		String s1 = new String(" sundar "); // string create via new keyword
		String s2 = "balajisundar";// string create via string literal
		int s3 = 1996;
		
		
//Return charcter value for particular index		
	char c =s1.charAt(1);
	System.out.println(c);
	
	//returns string length
	System.out.println(s1.length());
	
	//check the equality of the string
	System.out.println(s1.equals("Sundar"));
	
	// check the equality of the string ignore uppercase or lowercase
	System.out.println(s1.equalsIgnoreCase(s1));
	
	//check if string is empty or not
	System.out.println(s1.isEmpty());
	
	// Check if string is blank or not
   System.out.println(s1.isBlank());
   
   // check if string given value is present or not
   System.out.println(s1.contains("n"));
   
   
   // particular portion of the string begin and end index
   System.out.println(s2.substring(6,11));
   
   // particular portion of the string
   System.out.println(s2.substring(1));
   
   // to join two string
   System.out.println(s2.concat("kannan"));
   
   // replace character with give character
   System.out.println(s2.replace("s", "S"));
   
System.out.println(s1.replace("sundar","sp"));


//to find the char indexof position
	System.out.println(s1.indexOf("a"));
	
	System.out.println(s1.indexOf("a",3));
	
	
	// remove unwanted space
	System.out.println(s1.trim());
	
	//convert the given datatype to string
	System.out.println(String.valueOf(s3));
	
	
	String uppercase = "SUNDAR";
	System.out.println(uppercase.toLowerCase());
	
	String lowercase = "SUNDAR";
	System.out.println(lowercase.toUpperCase());
	
	// return a joined string with given dilimeter
	System.out.println(String.join("-","sundar","balaji"));
	System.out.println(String.join("/","120","2"));
	
	//split
	String splitthis = "Am,I,Teaching,good?";
	String [] splitted = splitthis.split(",");
	for (String string : splitted) {
		System.out.println(string);
	}
	
	

	}

}
