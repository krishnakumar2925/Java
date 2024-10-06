package javatraining;

import java.util.Scanner;

public class DSA_demo {
	
	public static String Reversestring(String input) {
		String output="";
		if(input.isEmpty()) {
			return "String is empty to reverse";
			
		}else {
			for(int i=input.length()-1;i>=0;i--) {
				 output=output+String.valueOf(input.charAt(i));
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		
		String b=Reversestring(a);
		
		System.out.println(b);
		}

}
