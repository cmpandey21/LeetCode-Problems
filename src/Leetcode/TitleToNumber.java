package Leetcode;
/*
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Input: columnTitle = "A"
Output: 1
 */
public class TitleToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="AB";
		TitleToNumber ob=new TitleToNumber();
		System.out.println(ob.titleToNumber(s));
	}
	 public int titleToNumber(String columnTitle) {
	        
     int result=0;
     
     for(int i=0;i<columnTitle.length();i++)
     {
    	 result=result*26+((columnTitle.charAt(i)-'A')+1);
     }
     
     return result;
	 }

}
