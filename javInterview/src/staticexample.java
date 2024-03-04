
public class staticexample {

	
	
	public static void method1() {
		 System.out.println("static method");
		
	}
	
	public void method2() {
	
		System.out.println("non static");
	}
	
	public static void main(String[] args) {
		staticexample c = new staticexample();
		c.method2();
		method1();

	}

}
