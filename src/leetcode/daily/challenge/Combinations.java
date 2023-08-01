package leetcode.daily.challenge;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4, k = 2;
		System.out.println(combine(n,k));
		
	}
	
	 public static List<List<Integer>> combine(int n, int k) {
	        List<List<Integer>> subsets=new ArrayList();
	        generateSubsets(1,n,new ArrayList(), subsets, k);
	        return subsets;
	        
	    }

	private static void generateSubsets(int start, int n,List<Integer> current, List<List<Integer>> subsets, int k) {
		
		
		if(current.size()==k)
		{
			subsets.add(new ArrayList(current));
		}
		
		for(int i=start; i<=n;i++)
		{
			current.add(i);
			generateSubsets(i+1,n,current,subsets, k);
			current.remove(current.size()-1);
		}
	}
}
