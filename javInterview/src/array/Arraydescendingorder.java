package array;

import java.util.Arrays;
import java.util.Collections;

public class Arraydescendingorder {

	public static void main(String[] args) {
	Integer [] number = {6,8,9,12,67};
		Arrays.sort(number,Collections.reverseOrder());
		for (Integer integer : number) {
			System.out.println(integer);
			
		}
		

	}

}
