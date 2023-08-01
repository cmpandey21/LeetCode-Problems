package problems.leetcode;
/*
Input: n = 7
Output: 21
Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
 */
public class SumMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		int result =sumOfMultiples(n);
		System.out.println(result);
	}
	
public static int sumOfMultiples(int n) {
   int sum=0;
   for(int i=1;i<=n;i++)
   {
	   if(i%3 ==0 || i%5==0 || i%7==0) {
		   sum=sum+i; 
	   }
	   
   }
   
	return sum;
    }

}
