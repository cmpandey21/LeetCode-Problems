package problems.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
  Input: s = "ABFCACDB"
Output: 2
Explanation: We can do the following operations:
- Remove the substring "ABFCACDB", so s = "FCACDB".
- Remove the substring "FCACDB", so s = "FCAB".
- Remove the substring "FCAB", so s = "FC".
So the resulting length of the string is 2.
It can be shown that it is the minimum length that we can obtain.
 */
public class MinLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABFCACDB";
		System.out.println(minLength(s));
	}

	public static int minLength(String s) {
		 
		 
		 while(true)
			{
				{
					int index=s.indexOf("AB");
				
				if(index!=-1)
				{
					s=s.substring(0, index)+s.substring(index+2);
					continue;
				}
				
			}
				{
				
					int index=s.indexOf("CD");
				
				
				if(index!=-1)
				{
					s=s.substring(0, index)+s.substring(index+2);
					continue;
					
				}
				
			}
				System.out.println(s);
				return s.length();
			}
			
			}
		 
	    }


