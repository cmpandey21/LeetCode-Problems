package Leetcode;

import java.util.Scanner;

public class Pivot_Solution {
	
	
	public static int pivotIndex(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int LSum=0;
        int RSum=sum;
        for(int i=0;i<nums.length;i++)
        {
            RSum=RSum-nums[i];
            if(LSum==RSum)
            {
                return i;
            }
            LSum=LSum+nums[i];
        }
        return -1;
    }
	
	public static void main(String[] args)
	{
		int [] arr= {1,7,3,6,5,6};
		System.out.println(pivotIndex(arr));
	}
}
