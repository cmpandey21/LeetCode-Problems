package problems.leetcode;

/*
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
 */
public class ArrayStringsAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] word1= {"ab", "c"};
		String [] word2 = {"a", "bc"};
		boolean result=arrayStringsAreEqual(word1,word2);
		System.out.println(result);
	}
public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
	String s=String.join("", word2);
	String s1=String.join("", word1);
	
if(s.equals(s1))
{
	return true;
}
	return false;
	}


	
    }
	

