package javatraining;

import java.util.ArrayList;
import java.util.Collections;

public class Find_K_Largest_Number {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr= {3, 2, 1, 5, 6, 4};
		int k=3;
		int result=K_largestnumber(arr,k);
		System.out.println(result);
		
		

	}
	public static int K_largestnumber(int[] arr,int k) {
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int num:arr) {
			list.add(num);
		}
		Collections.sort(list,Collections.reverseOrder());
//		Collections.sort(list);
//		Collections.reverse(list);
//		for(int num:list) {
//			System.out.print(num);
//		}
		
		return list.get(k-1);
		
	}

}
