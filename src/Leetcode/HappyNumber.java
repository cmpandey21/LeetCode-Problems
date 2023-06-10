package Leetcode;
/*
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		
		System.out.println(isHappy(n));
	}
	
	 public static boolean isHappy(int n) {
		 
		 boolean result=false;	
		 
		 while(true)
		 {
		 int sum=0;
		 while (n!=0)
		 {
			 int d=n%10;
			 sum=sum+d*d;
			 n=n/10;
		 }
	
		 if(sum==1)
		 {
			 result =true;
			 break;
		 }
		 
		 else if(sum == 4)
		 {
			 result=false;
			 break;
		 }
		 else
		 {
			 n=sum;
		 }
		
		 
		 }
		 
		 return result;
	       
	    }

}
