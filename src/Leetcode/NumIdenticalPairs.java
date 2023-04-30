package Leetcode;

/*
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

public class NumIdenticalPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,2,3,1,1,3};
		int result=numIdenticalPairs(nums);
		System.out.println(result);
	}
	
public static int numIdenticalPairs(int[] nums) {
       int count =0;
       for(int i=0;i<nums.length;i++)
       {
    	   for(int j=i+1;j<nums.length;j++)
    		   
    	   {
    		   if(nums[i]==nums[j])
    		   count++;
    	   }
       }
       
       return count;
    }

//Another solution with better approach

/*
public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] count = new int[101];
        
        for(int n: nums)
            count[n]++;
        
        for(int n: count)
            ans += (n * (n - 1))/2;
        
        return ans;
}
*/
}