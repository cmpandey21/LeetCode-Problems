package Leetcode;
/*
Input: s = "leetcode"
Output: 0
 */
public class FirstUniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}
	
public static int firstUniqChar(String s) {
        
	int [] arr=new int[256];
    for(int i=0;i<s.length();i++)
    {
    	arr[s.charAt(i)-'a']++;
    }
    
    for(int i=0;i<s.length();i++)
    {
    	if(arr[s.charAt(i)-'a']==1)
    	{
    		return i;
    	}
    	
    }
	return -1;
    }

}
