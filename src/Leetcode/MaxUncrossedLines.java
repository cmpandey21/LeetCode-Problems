package Leetcode;

import java.util.Arrays;

/*
Input: nums1 = [1,4,2], nums2 = [1,2,4]
Output: 2
Explanation: We can draw 2 uncrossed lines as in the diagram.
We cannot draw 3 uncrossed lines, because the line from nums1[1] = 4 to nums2[2] = 4 will intersect the line from nums1[2]=2 to nums2[1]=2.
 */
public class MaxUncrossedLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums1 = {1,4,2}, nums2 = {1,2,4};
		System.out.println(maxUncrossedLines(nums1,nums2));
	}
	
	 public static int maxUncrossedLines(int[] nums1, int[] nums2) { 
	    	    int m = nums1.length;
	        int n = nums2.length;
	        int[][] dp = new int[m + 1][n + 1];

	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (nums1[i - 1] == nums2[j - 1]) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                    System.out.println("Same"+dp[i][j]);
	                } else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                    System.out.println("different"+dp[i][j]);
	                }
	            }
	        }

	        System.out.println(dp[m][n]);
	        return dp[m][n];
	    }

}
