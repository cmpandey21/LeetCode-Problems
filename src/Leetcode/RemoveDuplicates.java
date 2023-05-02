package Leetcode;
/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,1,2};
		int result=removeDuplicates(nums);
		System.out.println(result);
		
	}
	 public static int removeDuplicates(int[] nums) {
	        if(nums.length==0)
	        	return 0;
	        
	      int index=1;
	      
	      for(int i=0;i<nums.length-1;i++)
	      {
	    	  if(nums[i]<nums[i+1]) {
	    		nums[index]=nums[i+1];
	   
	    		index++;
	    	  }
	      }
			return index;
	        
	        
	    }
	
}
