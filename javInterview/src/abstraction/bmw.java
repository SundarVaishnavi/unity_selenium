package abstraction;

public class bmw extends car implements cardoor,carseat{
	
	
	
	
	

	public static void main(String[] args) {
		

		car c = new bmw(); //
		
		
		c.engine();
        c.carBreak();
        c.door();
        
        cardoor d = new bmw();
        d.door1();
        d.door2();
        d.door3();
        d.door4();
        d.reardicky();
        d.bannet();
        
        carseat s = new bmw();
        s.frontseat();
        s.rearseat();
	}

	@Override
	public void door1() {
		System.out.println("door1");
		
	}

	@Override
	public void door2() {
		System.out.println("door2");
		
	}

	@Override
	public void door3() {
		
		System.out.println("door3");
	}

	@Override
	public void door4() {
		
		System.out.println("door4");
	}

	@Override
	public void reardicky() {
		System.out.println("reardicky");
		
	}

	@Override
	public void frontseat() {
		System.out.println("frontseat");
		
	}

	@Override
	public void rearseat() {
		System.out.println("rearseat");
		
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carBreak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bannet() {
		// TODO Auto-generated method stub
		
	}

}
