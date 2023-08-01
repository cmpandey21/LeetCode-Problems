package problems.leetcode;
/*
Input: s = "A1:F1"
Output: ["A1","B1","C1","D1","E1","F1"]
Explanation:
The above diagram shows the cells which should be present in the list.
The red arrow denotes the order in which the cells should be presented.
 */

import java.util.ArrayList;
import java.util.List;

public class CellsInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A1:F1";
		List<String> result=cellsInRange(s);
		System.out.println(result);
		
	}

	
	 public static List<String> cellsInRange(String s) {
	        List<String> result=new ArrayList<>();
	        char [] C=s.toCharArray();
	        for(char r=C[0];r<=C[3];r++)
	        {
	        	for(char c=C[1];c<=C[4];c++)
	        	{
	        		result.add(""+r+c);
	        	}
	        		
	        }
	        return result;
	    }
}
