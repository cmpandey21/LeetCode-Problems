package problems.leetcode;

/*
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */
public class ConcatenationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,2,1};
		int [] ans=getConcatenation(nums);
		display(ans);
	}
	public static void display(int[] ans)
	{
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	
	 public static int[] getConcatenation(int[] nums) {
		 int n=nums.length;
		 int [] ans=new int[n*2];
		 
		 
		 for(int i=0;i<n;i++)
		 {
			 ans[i]=nums[i];
			 ans[i+n]=nums[i];
		 }
		 
		 return ans;
	        
	    }

}
