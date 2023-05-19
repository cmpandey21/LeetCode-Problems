package Leetcode;

import java.util.Arrays;

/*
Input: s = "anagram", t = "nagaram"
Output: true
 */
public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s,t));
	}
	
	 public static boolean isAnagram(String s, String t) {
	        char []  ch=t.toCharArray();
	        char []  chs=s.toCharArray();
	        t="";
	        s="";
	        Arrays.sort(ch);
	        Arrays.sort(chs);
	        for(char i=0;i<ch.length;i++)
	        {
	        	t=t+ch[i];
	        }
	        
	        for(char i=0;i<chs.length;i++)
	        {
	        	s=s+chs[i];
	        }
	        if(s.equals(t))
	        {
	        	return true;
	        }
	        else
	        {
	        	return false;
	        }
	    }

}
