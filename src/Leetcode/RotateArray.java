package Leetcode;
/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,2,3,4,5,6,7};
		int k=3;
		rotate(nums,k);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i] +" ");
		}
	}
	
public static void rotate(int[] nums, int k) {
     
	  k = k % nums.length;
	  
	  reverse(nums,0,nums.length-k-1);
	  reverse(nums,nums.length-k,nums.length-1);
	  reverse(nums,0,nums.length-1);
	  
     }
private static void reverse(int nums[], int i, int j)
{
	int temp=0;
	while(i<j)
	{
		temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		i++;
		j--;
	}
}

}


