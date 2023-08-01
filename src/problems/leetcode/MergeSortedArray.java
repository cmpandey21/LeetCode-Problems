package problems.leetcode;
/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=3,n=3;
		int [] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		merge(nums1,m,nums2,n); 
		
	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int j=0;
	        
	        for(int i=m;i<m+n;i++)
	        {
	        		nums1[i]=nums2[j];
	        		j++;
	        
	        }
	        
	        nums1=sortArray(nums1,m+n);
	        
	        for(int i=0;i<m+n;i++)
	        {
	        	System.out.print(nums1[i]);
	        }
	        
	    }
	 public static int [] sortArray(int[] num,int n)
	 {
		 int temp=0;
		 for(int i=0;i<num.length-1;i++)
		 {
			 for(int j=0;j<num.length-1;j++)
			 {
				 if(num[j]>num[j+1])
				 {
					
					 temp=num[j];
					 num[j]=num[j+1];
					 num[j+1]=temp;
				 }
			 }
		 }
		 
		 return num;
	 }
	 

}
