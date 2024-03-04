package constructor;

public class parametrizedconstructor {
	
	
	String Dog_name;
	String Fish_Type;
	int LiveFish_count;
	
	parametrizedconstructor(String name ,String Type ,int count){
	
		Dog_name ="name";
		Fish_Type ="type";
		LiveFish_count =0;
		
		
	}
	
	public void petanimalsdetails() {
		
		System.out.println("petanimaldetails:"+Dog_name+"Fish detaills"+Fish_Type+"livefish"+LiveFish_count);
	}
	

	public static void main(String[] args) {
		
		parametrizedconstructor p =  new parametrizedconstructor("nancy","flowerhorn", 2);
		p.petanimalsdetails();

		parametrizedconstructor p1 =  new parametrizedconstructor("raghu","goldfish", 2);
		p1.petanimalsdetails();
		

	}

}
