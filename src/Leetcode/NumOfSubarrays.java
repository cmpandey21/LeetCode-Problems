package Leetcode;
/*
Input: arr = [1,3,5]
Output: 4
Explanation: All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
All sub-arrays sum are [1,4,9,3,8,5].
Odd sums are [1,9,3,5] so the answer is 4.
 */


public class NumOfSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {1,3,5};
      int result=numOfSubarrays(arr);
      System.out.println(result);

	}

	 public static int numOfSubarrays(int[] arr) {
		    int sum = 0, odd = 0;
		    for (int i = 0; i < arr.length; ++i) {
		        odd = arr[i] % 2 == 1 ? i - odd + 1 : odd;
		        sum = (sum + odd)  % 1000000007;
		    }
		    return sum;
	    }
}
