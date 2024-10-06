package javatraining;

public class SecondLargestnumber_array2 {
	
	public static void main(String[] args) {
		//int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5};
		int[] array = {7,7,1};
		//int[] array= {};
		findMax(array);
		//System.out.println(max);
	}
	
	public static void findMax(int[] a) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		if(a.length<2) {
			System.out.println("Array does not have enough elements"); 
		}
		
			for(int i=0;i<a.length;i++) {
				if (first<a[i]) {
	                second = first;  // Move first to second
	                first = a[i];     // Update first
	            } 
	            // Update second if it's less than the current value and not equal to first
	            else if (second<a[i]  && a[i] != first) {
	                second = a[i];
	            }
	        }
			if(second==Integer.MIN_VALUE) {
				System.out.println("Array does not have two distinct elements.");
			}else {
				System.out.println(second);
			}
			
		}
		
	}


