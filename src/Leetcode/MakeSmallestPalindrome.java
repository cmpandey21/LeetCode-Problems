package Leetcode;
/*
Input: s = "egcfe"
Output: "efcfe"
Explanation: The minimum number of operations to make "egcfe" a palindrome is 1, 
and the lexicographically smallest palindrome string we can get by modifying one 
character is "efcfe", by changing 'g'.
 */
public class MakeSmallestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String s = "seven";
		
		System.out.println(makeSmallestPalindrome(s));
	}
       public static String makeSmallestPalindrome(String s) {
        
    	   char [] c=s.toCharArray();
    	   int n=c.length;
    	   
    	   for(int i=0,j=n-1;i<j;i++,j--)
    	   {
    		   if(c[i]!=c[j])
    		   {
    			   char min=(char) Math.min(c[i], c[j]);
    			   c[i]=c[j]=min;
    		   }
    	   }
    	   
    	   return new String(c);
    }
}
