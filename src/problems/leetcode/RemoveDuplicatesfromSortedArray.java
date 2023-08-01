package problems.leetcode;
/*
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements 
of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k 
(hence they are underscores).
 */
public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,1,1,2,2,3};
		int result=removeDuplicates(nums);
		System.out.println(result);	
	}
	
	 public static int removeDuplicates(int[] A) {
		   int i = 2;
	        for (int j = 2; j < A.length; j++)
	            if (A[j] != A[i-2])
	                A[i++] = A[j];
	        return i;
	    
	   
	      }
	        
	    
	}


