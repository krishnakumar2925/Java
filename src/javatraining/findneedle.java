package javatraining;

public class findneedle {
	public static void main(String[] args) {
		String hatchback="hello";
		String needle="ill";
		int result=indexofneedle(hatchback,needle);
		System.out.println(result);
	}
	
	public static int indexofneedle(String a,String b) {
		
		int length1=a.length();
		int length2=b.length();
		
		if(length1<length2) {
			return -1;
		}
		
		for(int i=0;i<=length1-length2;i++) {
			String c= a.substring(i,i+length2);
			//System.out.println(c);
			if(c.equals(b)) {
				return i;
			
		}
	}
		return -1;
	}
}

