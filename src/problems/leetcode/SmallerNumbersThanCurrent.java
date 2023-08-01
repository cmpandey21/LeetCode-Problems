package problems.leetcode;
/*
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
*/

public class SmallerNumbersThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {8,1,2,2,3};
		int [] arr=smallerNumbersThanCurrent(nums);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		
	}
	
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
		 
		 int [] arr=new int[nums.length];
	        
		 for(int i=0;i<nums.length;i++)
		 {
			 int count=0;
			 for(int j=0;j<nums.length;j++)
			 {
				 if(nums[j]<nums[i])
				 {
					 count++;
				 }
			 }
			 
			 arr[i]=count;
		 }
		 
		 return arr;
	    }

}
