package Leetcode;
/*
Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 */
public class ArraySign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int [] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};//{1,5,0,2,-3};//{-1,1,-1,1,-1};//{-1,-2,-3,-4,3,2,1};
		int result=arraySign(nums);
		System.out.println(result);
	}

	 public static int arraySign(int[] nums) {
	     int l=nums.length;
	     double m=1;
	     for(int i=0;i<l;i++)
	     { 
	    	 m=m*nums[i];
	     }
	     int result=(int) Math.signum(m);
	    
	     return result;
	    }
	
}
