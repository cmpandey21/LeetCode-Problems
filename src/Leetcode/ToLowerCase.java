package Leetcode;
/*
Input: s = "Hello"
Output: "hello"
 */
public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(toLowerCase("Hello"));
		
	}
	
	 public static String toLowerCase(String s) {
		 String s1="";
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			 {
				 
				 
				 char index1=(char) (s.charAt(i)+32);
				 /*
				 int c=s.charAt(i)-'A';
				 System.out.println(c);
				 s1=s1+((char)('a'+c));
				 */
				 s1=s1+index1;
				 
			 }
			 
			 else
			 {
				 s1=s1+s.charAt(i);
			 }
		 }
	        return s1;
	    }

}
