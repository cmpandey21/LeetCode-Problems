package problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,2,3};
     System.out.println(subsets(nums));
	}
	
	public static List<List<Integer>> subsets(int[] nums)
	{
		 Arrays.sort(nums);
		 
		 List<List<Integer>> result=new ArrayList<>();
		 
		result.add(new ArrayList<>());
		for(int num:nums)
		{
			int n=result.size();
			for(int j=0;j<n;j++)
			{
				List<Integer> temp=new ArrayList(result.get(j));
				temp.add(num);
				result.add(temp);
			}
			
		}
		return result;
		   
		    }
		 
	}



