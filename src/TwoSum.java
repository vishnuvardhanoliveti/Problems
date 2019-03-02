/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

/*Returning an array without assigning to a variable  
https://stackoverflow.com/questions/9331837/returning-an-array-without-assign-to-a-variable
*/

import java.util.Arrays;

public class TwoSum {

		public int[] twoSum(int[] nums, int target) {
	        int size=nums.length;
	         int[] result =new int[2];
	        for(int i=0;i<size;i++){
	                for(int j=i+1; j<size;j++){
	                    int sum = nums[i]+nums[j];
	                    if(sum == target)
	                    {
	                       result[0] = i;
	                       result[1] = j;
	                        break;
	                     
	                    }
	                   
	                }
	            
	        }
	        return result;
	    

	}
		public static void main(String[] args) {
			TwoSum obj = new TwoSum();
			System.out.println(Arrays.toString(obj.twoSum(new int[] {2,7,11,15},9)));
		}

}
