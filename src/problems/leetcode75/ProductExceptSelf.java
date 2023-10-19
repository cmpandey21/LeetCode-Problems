package problems.leetcode75;

/*
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */
public class ProductExceptSelf {

	public static void main(String[] args) {

		int nums[] = {1,2,3,4};
		int answer[] =productExceptSelf(nums);
		for(int i=0;i<answer.length;i++)
		{
		 System.out.println(answer[i]);
		}
	}

	public static int[] productExceptSelf(int[] nums) {
 
		/*int ans[]=new int[nums.length];
		
		for(int i=0;i<nums.length;i++)
		{
			int mul=1;
			for(int j=0;j<nums.length;j++)
			{
			 if(i==j) continue;
			 mul=mul*nums[j];
			 
			}
			
			ans[i]=mul;
		}
		
		return ans;*/
		
		int n = nums.length;
        int pre[] = new int[n];
        int post[] = new int[n];
        int ans[] = new int[n];
        int temp = 1;
        for(int i=0;i<n;i++){
            temp *= nums[i];
            pre[i] = temp;
        }   
        temp=1;
        for(int i=n-1;i>=0;i--){
            temp *= nums[i];
            post[i] = temp;
        }
        ans[0] = post[1];
        ans[n-1] = pre[n-2];
        for(int i=1;i<n-1;i++){
            ans[i] = pre[i-1]*post[i+1];
        }
        return ans;
	}

}
