package Leetcode;

/*
Input: s = "daabcbaabcbc", part = "abc"
Output: "dab"
 */
public class RemoveOcurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=removeOcurrences("daabcbaabcbc","abc");
		System.out.println(s);
	}
	
	public static String removeOcurrences(String s, String part)
	{
		
		int l=part.length();
		while(true)
		{
			int index=s.indexOf(part);
			System.out.println(index);
			if(index>-1)
			{
				s=s.substring(0, index)+s.substring(index+l);
				System.out.println(s);
			}
			else
			{
				break;
			}
		}
		
		return s;
	}

}
