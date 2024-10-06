package javatraining;

import java.util.Scanner;

public class Remove_vowels {
	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		String words=word.nextLine();
		String result=RemoveVowels(words);
		System.out.println(result);
		
	}
	
	public static String RemoveVowels(String a) {
		StringBuilder point=new StringBuilder();
		String b= a.toLowerCase();
		
		for(char c:b.toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				continue;
			}
			point.append(c);
		}
		return point.toString();
		
	}

}
