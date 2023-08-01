package problems.leetcode;

public class RunningSumSolution {

	public int[] runningSum(int[] nums) {
        int size=nums.length;
        int sum=0,j=0;
        int [] arr=new int[size]; 
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+nums[i];
            arr[j++]=sum;

        }
        return arr;
    }

}
