package problems.leetcode;

/*
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */
public class MaximumWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{1,5},{7,3},{3,5}};// { { 1, 2, 3 }, { 3, 2, 1 } };
		int result = maximumWealth(arr);
		System.out.println(result);

	}

	public static int maximumWealth(int[][] accounts) {
		int max=0,result = 0;
		for(int i=0;i<accounts.length;i++)
		{
			int sum=0;
			for(int j=0;j<accounts[i].length;j++)
			{
				sum=sum+accounts[i][j];
				
			}
		
			
			
			if(sum>=max)
			{
				result=sum;
				max=sum;
			}
		}
		return result;
	}

}
