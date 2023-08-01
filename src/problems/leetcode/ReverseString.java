package problems.leetcode;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		char [] s = {'h','e','l','l','o'};
		reverseString(s); 
	
		
	}
	
	public static void reverseString(char[] s) {
        int n=s.length;
 
        int j=0;
        for(int i=n-1;i>j;i--)
        {
        	char temp=s[j];
        	s[j++]=s[i];
           s[i]=temp;
        }
        
        System.out.println(Arrays.toString(s));
       
        
        
    }
	

}
