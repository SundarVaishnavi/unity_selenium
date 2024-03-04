package Exceptionhandling;

public class singletrycatchexample {

	public static void main(String[] args) {
	try {
			int number1 = 0;
			int number2 = 3;
			int result = number2/number1;
			System.out.println(result);
			}
catch (ArithmeticException e) {
e.printStackTrace();

System.out.println("don't divided by  zero");
}
	
	
catch (NullPointerException e) {
		e.printStackTrace();
		System.out.println("drink a lemon juice and don't divided by  zero");	
	}
	catch (Exception e) {
		e.printStackTrace();
		System.out.println("drink a lemon juice and don't divided by  zero");	}

//catch (Exception e) {
		//e.printStackTrace();
		//System.out.println("drink a lemon juice and don't divided by  zero");	
	}
	
	
	
	
}

