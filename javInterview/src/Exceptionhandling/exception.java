package Exceptionhandling;

public class exception {

	public static void main(String[] args) {
	try {
		
		System.out.println("inside try block");
		
		throw new NullPointerException();
		
	
	
	}catch(NullPointerException e) {
		e.printStackTrace();
		System.out.println(" null exception");
		
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(" exception block");
	}
finally {
	System.out.println("inside final block");
}
	}

	
	}


