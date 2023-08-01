package problems.leetcode;

import java.util.Arrays;

/*
Input: nums = [3,2,3]
Output: 3
 */
public class MajorityElement {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] arr = {3,2,3};
		
		System.out.println(majorityElement(arr));
	}

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
	     return nums[nums.length/2];
	}

}
