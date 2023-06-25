package Leetcode;
/*
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */
public class TwoSum {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
   int [] numbers = {2,7,11,15}; 
   int target = 9;
   int [] arr=twoSum(numbers,target);
   for(int i=0;i<arr.length;i++)
   {
	   System.out.print(arr[i]);
   }
	}
	
	 public static int[] twoSum(int[] numbers, int target) {
	        int [] arr=new int[2];
	        int index=0;
	        int left=0, right=numbers.length-1;
	        while(left<right)
	        {
	        	    int sum=0;
	        		sum=sum+numbers[left]+numbers[right];
	        		if(sum==target)
	        		{
	        			arr[index]=left+1;
	        			arr[index+1]=right+1;
	        			break;
	        		}
	        		
	        		else if(sum>target)
	        		{
	        			right--;
	        		}
	        		else
	        		{
	        			left++;
	        		}
	        		
	        	
	        }
	        return arr;
	    }

}
