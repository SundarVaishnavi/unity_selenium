package polymorphism;

public class son extends parent{

	@Override
	public void marriage() {
		System.out.println("marriage my rule");
	}
	
	
	
	public static void main(String[] args) {
		parent p = new son();// dynamic object creating
		p.property();
        p.marriage();
		
	}
	
}
