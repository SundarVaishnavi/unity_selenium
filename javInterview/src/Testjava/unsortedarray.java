package Testjava;

public class unsortedarray {
	
	

	public static void main(String[] args) {
		
		// maximum
		int[]arr = {1,45,67,98,455,678};
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if(i>max) {
				max=i;
				
			
		}
			System.out.println("max element is:"+max);
			
		}
		
		int[]array = {1,45,67,98,455,678,-6};
		int min = Integer.MAX_VALUE;
		for(int v:array) {
			if(v<min) {
				min=v;
				
				
			}
			System.out.println("min element is:"+min);
		}

	}

}
