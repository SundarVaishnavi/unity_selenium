package array;

public class array1 {

	public static void main(String[] args) {
		int[] numbers;

        // Initialize the array with 5 elements
        numbers = new int[5];

        // Assign values to the elements of the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access and print the elements of the array
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 3: " + numbers[3]);
        System.out.println("Element at index 4: " + numbers[4]);
        

        // Alternatively, you can iterate over the array using a loop
        System.out.println("Iterating over the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
	}

}
