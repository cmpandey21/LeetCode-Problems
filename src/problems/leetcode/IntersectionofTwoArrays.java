package problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */
public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = { 4,9,5}, nums2 = {9,4,9,8,4};
		int[] res = intersect(nums1, nums2);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}

	public static int[] intersect(int[] nums1, int[] nums2) {    
	   Arrays.sort(nums1);
	   Arrays.sort(nums2);
	   int top=0,bottom=0;
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		 while(true)
		 {
			 if(top>= nums1.length || bottom>=nums2.length)
			 {
				 break;
			 }
			 if(nums1[top]==nums2[bottom])
			 {
				 arr.add(nums1[top]);
				 top++;
				 bottom++;
			 }
			 
			 else if (nums1[top]< nums2[bottom])
			 {
				 top++;
			 }
			 
			 else if (nums1[top]> nums2[bottom])
			 {
				 bottom++;
			 }
			 
		 }
		  
		  int[] intArray = new int[arr.size()];
	        for (int i = 0; i < arr.size() ; i++) {
	            intArray[i] = arr.get(i);
	        }
	        
		  return intArray;
	    }

}
