package polymorphism;

public class thewaytalk {

// The overloading happens in the same class
	//same method overloading again and again with different argument is called method overloading
	//Method overloading - static binding and compile time polymorphism
	
	
public void taking(parent styleoftaking) {
	System.out.println("polite taking");
			}
		
public void taking(partner styleoftaking) {
			System.out.println("romantic talk");
}
public void taking(son styleoftaking) {
	System.out.println("advice talk");
}
public void taking(boss styleoftaking) {
	System.out.println("business talk");
}

public static void main(String[] args) {
	

thewaytalk talk = new thewaytalk();
parent parents = new parent();
talk.taking(parents);
partner part = new partner();
talk.taking(part);
son s = new son();
talk.taking(s);
boss b = new boss();
talk.taking(b);


}}
