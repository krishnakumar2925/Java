package javatraining;

public class twoD_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
		                  {1, 3, 5, 7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 60}
		};
		int k=22;
		boolean result=false;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				int num=matrix[i][j];
				if(k==num) {
					result=true;
					break;
				}else {
					continue;
				}
			}
		}
		if(result) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

}
