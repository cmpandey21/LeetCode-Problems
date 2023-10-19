package problems.leetcode75;

/*
Input: s = "leetcode"
Output: "leotcede"
 */
public class ReverseVowelsOfString {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(reverseVowels(s));
	}

	  public static String reverseVowels(String s) {
		  if(s == null || s.length()==0) return s;
		    String vowels = "aeiouAEIOU";
		    char[] chars = s.toCharArray();
		    int left = 0;
		    int right = s.length()-1;
		    
		    while(left<right)
		    {
		    	while(left<right && !vowels.contains(chars[left]+""))
		    	{
		    		left++;
		    	}
		    	
		    	while(left<right && !vowels.contains(chars[right]+""))
		    	{
		    		right--;
		    	}
		    	
		    	char temp=chars[right];
		    	chars[right]=chars[left];
		    	chars[left]=temp;
		        left++;
		        right--;
		    }
			 
		    return new String(chars);
		  }
		  
	    }

