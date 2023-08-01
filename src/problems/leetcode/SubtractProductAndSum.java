package problems.leetcode;
/*
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
 */
public class SubtractProductAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 234;
		System.out.println(subtractProductAndSum(n));
	}

	 public static int subtractProductAndSum(int n) {
		    int sum=0, mul=1;
		    int nr=0;
		    while(n>0)
		    {
		    	nr=n%10;
		    	sum=sum+nr;
		    	mul=mul*nr;
		    	n=n/10;
		    }
		   
	        return mul-sum;
	    }

}
