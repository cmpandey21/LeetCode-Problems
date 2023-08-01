package problems.leetcode;
/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

   public static int maxSubArray(int[] nums) {
        int sum=0, max=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
        	sum=sum+nums[i];
        	max=Math.max(max, sum);
        	if(sum<0)
        	{
        		sum=0;
        	}
        }
        
        return max;
    }
}
