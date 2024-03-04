package constructor;

public class NoArgument {
	
	String stundent_name;
	int roll_number;
	
	 NoArgument(){
		
		 stundent_name = "sundar";
		 roll_number = 22;
		System.out.println("No argument constructor");
		
		
	}

	public static void main(String[] args) {
		
		
		NoArgument na = new NoArgument();

	}

}
