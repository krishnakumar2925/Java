package javatraining;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 1};
		int amount=robbed(arr);
		System.out.println(amount);

	}
	public static int robbed(int[] arr) {
		int total=0;
		for(int i=0;i<arr.length;i=i+2) {
			total+=arr[i];
		}
		return total;
	}

}
