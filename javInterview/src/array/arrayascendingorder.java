package array;

import java.util.Arrays;

public class arrayascendingorder {

	public static void main(String[] args) {
		int[] numbers = {5, 2, 9, 1, 6};
		Arrays.sort(numbers);
		System.out.println("Array sorted in ascending order");
		for(int number:numbers) {
			System.out.println(number);
		}

	}

}
