package problems.leetcode;

import java.util.HashSet;

/*
Input: nums = [1,13,10,12,31]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
 */
public class CountDistinctIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {1,13,10,12,31};
		int result =countDistinctIntegers(nums);
		System.out.println(result);

	}
	
	 public static int countDistinctIntegers(int[] nums) {
		 HashSet<Integer> s=new HashSet<>();
		 for(int a:nums)
		 {
			 s.add(a);
			 s.add(reverse(a));
		 }
		return s.size();
	        
	    }
	 
	 public static int reverse(int num)
	 {
		 int sum=0;
		 while(num>0)
		 {
			 sum=sum*10+num%10;
			 num=num/10;
		 }
		 
		 return sum;
		 
	 }

}
