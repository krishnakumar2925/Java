package javatraining;

public class Largestnumber_array {
	
	public class FindMax {
	    public static void main(String[] args) {
	        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5};
	        //int[] array = {};  // You can test with an empty array as well
	        int max = findMax(array);
	        System.out.println(max); // Expected Output: 9
	    }

	    public static int findMax(int[] a) {
	        if (a.length == 0) {
	            // Return a default value or throw an exception if the array is empty
	            System.out.println("Array is empty.");
	            return Integer.MIN_VALUE; // or some default value
	        }

	        // Initialize output to the first element of the array
	        int output = a[0];
	        
	        for (int i = 1; i < a.length; i++) {
	            if (output < a[i]) {
	                output = a[i];
	            }
	        }
	        return output;
	    }
	}
}
	


