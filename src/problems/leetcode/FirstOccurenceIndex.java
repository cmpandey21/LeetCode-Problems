package problems.leetcode;

public class FirstOccurenceIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(strStr("hello","ll"));
		System.out.println(strStr("sadbutsad","sad"));
		System.out.println(strStr("butsad","sad"));
	}
	
	 public static int strStr(String haystack, String needle) {

		 int j=needle.length();
	for(int i=0;i<=haystack.length()-j;i++)
	{
	    String S="";
	    S=haystack.substring(i,i+j);
	    if(needle.equals(S))
	    {
	        return i;
	   
	    }
	    //break;
	    
	   
	}
	
	return -1;
	
	
	
   
	    }
	

}
