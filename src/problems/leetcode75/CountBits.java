package problems.leetcode75;
/*
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
 */

public class CountBits {

	public static void main(String[] args) {
		int n = 2;
		int [] result=countBits(n);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	
	public static int[] countBits(int n) {
	        
		 int[] arr = new int[n+1];
	        arr[0] = 0;
	      for(int i =1;i<=n;i++){
	            int temp = i;
	            int count = 0 ;
	            while(temp != 0){ 
	                temp = temp & (temp-1);
	                count++;
	            }
	            arr[i] = count;
	        }
	        

	        return arr;
	    }

}
