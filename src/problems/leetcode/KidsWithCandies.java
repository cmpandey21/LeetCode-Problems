package problems.leetcode;
/*
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] candies = {2,3,5,1,3}; //{4,2,1,1,2};
		int extraCandies = 3;
		List<Boolean> result=kidsWithCandies(candies,extraCandies);
		System.out.println(result);
	}
	
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 int max=0;
		 List<Boolean> s=new ArrayList<Boolean>();
		 //Find max element
		 for(int i=0;i<candies.length;i++)
		 {
			 if(candies[i]>max)
			 {
				 max=candies[i];
			 }
			 
			
		 }
		 
		 for(int i=0;i<candies.length;i++)
		 {
			 int sum=0;
			 sum=candies[i]+extraCandies;
			 if(sum>=max)
				 s.add(true);
			 else
				s.add(false);
			 
			
		 }
		 return s;
	    }

}
