package abstraction;

public class maruthi extends car {
	
	
@Override	
public void engine() {
		System.out.println("maruthi engine");
		
	}

@Override
public void carBreak() {
	System.out.println("maruthi car break");


}

	public static void main(String[] args) {
		
		car c =new maruthi();
		c.engine();
        c.carBreak();

	}



}
