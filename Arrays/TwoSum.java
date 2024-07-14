package Arrays;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums={2,7,8,9,10};
        int target = 9;

        Solution s = new Solution();
        int[] ans = s.twoSum(nums, target);

        System.out.println();
        for(int a: ans){
            System.out.print(a+" ");
        }
    }
    
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

      
     for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] { i, j };

                }

            }
        }   
    return new int[] {};
 
    }
}