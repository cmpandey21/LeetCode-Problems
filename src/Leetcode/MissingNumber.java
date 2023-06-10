package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/*
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums= {0,1};
		System.out.println(missingNumber(nums));
		
	}
	
    public static int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int n = 0;
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
    	arr.add(nums[i]);
    }
    
    for(int i=0;i<arr.size()+1;i++)
    {
    	if(!arr.contains(i))
    	{
    		n=i;
    	}
    }
    
    return n;
    
    /* Another solution
      int actual = 0;
    int should = 0;
    
    for(int i=0; i<nums.length; i++){
        actual = actual+nums[i];
        should = should+i;
    }
    should = should+nums.length;
    
    return should-actual;*/
    
    /* Another solution using xor operator 
      int res = nums.length;
    for(int i=0; i<nums.length; i++){
        res = res ^ i ^ nums[i]; // a^b^b = a
    }
    return res;
    
     */
    }
    
}
