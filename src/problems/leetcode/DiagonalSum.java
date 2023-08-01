package problems.leetcode;
/*
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
 */
public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= {{1,2,3},
		              {4,5,6},
		              {7,8,9}};

		System.out.println(diagonalSum(arr));
	}
	 public static int diagonalSum(int[][] mat) {
	        int sum=0;
	        int n=mat.length;
	        for(int i=0;i<n;i++)
	        {
	        	sum=sum+mat[i][i]+mat[i][n-i-1];
	        }
	        
	        if(n%2!=0)
	        {
	        	sum=sum-mat[n/2][n/2];
	        }
	        return sum;
	    }

}
