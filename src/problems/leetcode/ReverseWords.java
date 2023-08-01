package problems.leetcode;
/*
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Let's take LeetCode contest";
	
		System.out.println(reverseWords(s));
	}
	
	   public static String reverseWords(String s) {
	     
		   String [] s1=s.split(" ");
		   String s2="";
		   
		   for(int i=0;i<s1.length;i++)
		   {
			   
			for(int j=s1[i].length()-1;j>=0;j--)
			{
			s2=s2+s1[i].charAt(j);	
			}
			if(i<s1.length-1)
			{
			s2=s2+" ";
			}	
		   }

		   return s2;
}
	   
}
