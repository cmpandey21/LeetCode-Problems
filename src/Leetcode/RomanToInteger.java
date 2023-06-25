/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Input: s = "III"
Output: 3
Explanation: III = 3.
 */
package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="III";
		System.out.println(romanToInt(s));
	}
	
   public static int romanToInt(String s) {
	
	   Map<Character, Integer> map=new HashMap<>();
	   map.put('I',1);
	   map.put('V',5);
	   map.put('X',10);
	   map.put('L',50);
	   map.put('C',100);
	   map.put('D',500);
	   map.put('M',1000);
	   
	   int result=map.get(s.charAt(s.length()-1));
	   for(int i=s.length()-2;i>=0;i--)
	   {
		   if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
		   {
			   result-=map.get(s.charAt(i));
		   }
		   else
		   {
			   result+=map.get(s.charAt(i));   
		   }
	   }
	   
	   return result;
        
    }

}
