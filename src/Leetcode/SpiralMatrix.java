package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> list=spiralOrder(arr);
		System.out.println(list);
		
	}
   public static List<Integer> spiralOrder(int[][] arr) {
      List<Integer> list=new ArrayList<Integer>();
      int top=0,bottom=arr.length-1,left=0,right=arr[top].length-1, count=(bottom+1)*(right+1), dir=1;
      
      while(left<=right && top<=bottom)
      {
    	  if(count>0)
    	  {
    		  for(int i=left;i<=right;i++)
    		  {
    			  list.add(arr[top][i]);
    			  count--;
    		  }
    		  dir=2;
    		  top++;
    	  }
    	  
    	  if(count>0)
    	  {
    		  for(int i=top;i<=bottom;i++)
    		  {
    			  list.add(arr[i][right]);
    			  count--;
    		  }
    		  dir=3;
    		  
    		  right--;
    	  }
    	  
    	  if(count>0)
    	  {
    		  for(int i=right;i>=left;i--)
    		  {
    			  list.add(arr[bottom][i]);
    			  count--; 
    		  }
    		  
    		  dir=4;
    		  bottom--;
    	  }
    	  
    	  if(count>0)
    	  {
    		  for(int i=bottom;i>=top;i--)
    		  {
    			  list.add(arr[i][left]);
    			  count--; 
    		  }
    		  
    		  dir=1;
    		  left++;
    	  }
      }
     return list; 
    }

}
