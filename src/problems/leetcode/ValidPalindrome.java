package problems.leetcode;
/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "0P";//"A man, a plan, a canal: Panama";
		boolean result=isPalindrome(s);
		System.out.println(result);
	}
	
	public static boolean isPalindrome(String s) {
        String s2="";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
        	
        	if(s.charAt(i)>='A' && s.charAt(i)<='Z')
        	{
               char c=(char) (s.charAt(i)+32); 
        	  s1=s1+c;
        	}
        	
        	else if(s.charAt(i)>='a' && s.charAt(i)<='z')
        	{
        		s1=s1+s.charAt(i);
        	}
        	
        	else if(s.charAt(i)>='0' && s.charAt(i)<='9')
        	{
        		s1=s1+s.charAt(i);
        	}
            
        }
        
        
        for(int i=s.length()-1;i>=0;i--)
        {
        	
        	if(s.charAt(i)>='A' && s.charAt(i)<='Z')
        	{
               char c=(char) (s.charAt(i)+32); 
        	  s2=s2+c;
        	}
        	
        	else if(s.charAt(i)>='a' && s.charAt(i)<='z')
        	{
        		s2=s2+s.charAt(i);
        	}
        	
        	else if(s.charAt(i)>='0' && s.charAt(i)<='9')
        	{
        		s2=s2+s.charAt(i);
        	}
            
        }
        

        if(s1.equals(s2))
        {
            return true;
        }
        else{
             return false;
             }
        }

}
