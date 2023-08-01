package problems.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

 */
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nr=5;
		System.out.println(generate(nr));

		
	}
	
	 public static List<List<Integer>> generate(int numRows) {

		 List<List<Integer>> triangle = new ArrayList<List<Integer>>();
	        if (numRows <=0){
	            return triangle;
	        }
	        for (int i=0; i<numRows; i++){
	            List<Integer> row =  new ArrayList<Integer>();
	            for (int j=0; j<i+1; j++){
	                if (j==0 || j==i){
	                    row.add(1);
	                } else {
	                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
	                }
	            }
	            triangle.add(row);
	        }
	        return triangle;
	 }
}
