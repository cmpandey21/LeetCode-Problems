package Leetcode;

import java.util.Arrays;

/*
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {0,1,0,3,12};
		
		moveZeroes(nums);
		

	}

	 public static void moveZeroes(int[] nums) {
	        
	    int LastNonZeroIndex=0;
	    
	    for(int i=0;i<nums.length;i++)
	    {
	    	if(nums[i]!=0)
	    	{
	    		nums[LastNonZeroIndex]=nums[i];
	    		LastNonZeroIndex++;
	    	}
	    
	    }
	  
	    for(int k=LastNonZeroIndex;k<nums.length;k++)
	    { 	
	    		nums[k]=0;
	    }
	  
	 }
	 
}
