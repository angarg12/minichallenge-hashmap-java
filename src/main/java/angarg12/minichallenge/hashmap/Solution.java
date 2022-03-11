package angarg12.minichallenge.hashmap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[]{};
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if(nums[i] + nums[j] == target)
                    results = new int[]{i, j};
            }
        }
        return results;
    }

    // Can you implement this function so that is runs faster than twoSum?
    public int[] twoSumFast(int[] nums, int target) {
        return new int[]{};
    }
}
