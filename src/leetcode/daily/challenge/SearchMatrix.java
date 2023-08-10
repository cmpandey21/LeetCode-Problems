package leetcode.daily.challenge;

public class SearchMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix(arr,39));
	}
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        int i=0;
	        int j=matrix[0].length-1;

	        while(i< matrix.length && j>=0)
	        {
	            if(matrix[i][j]==target)
	            {
	                return true;
	            }
	            else if(target<matrix[i][j]){
	                j--;
	            }

	            else
	            {
	                i++;
	            }
	        }

	        return false;
	    }

}
