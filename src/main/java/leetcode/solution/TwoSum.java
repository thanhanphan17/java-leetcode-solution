// https://leetcode.com/problems/two-sum/
package leetcode.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static class Solution {

        /**
         * Finds the indices of two numbers in the given array that add up to the target value.
         *
         * @param nums The array of integers.
         * @param target The target value.
         * @return The indices of the two numbers that add up to the target value, or null if no such numbers exist.
         */
        public int[] twoSum(int[] nums, int target) {
            // Create a map to store the numbers and their indices
            Map<Integer, Integer> map = new HashMap<>();

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                // Calculate the complement of the current number
                int complement = target - nums[i];

                // Check if the complement exists in the map
                if (map.containsKey(complement)) {
                    // Return the indices of the two numbers
                    return new int[]{map.get(complement), i};
                }

                // Add the current number and its index to the map
                map.put(nums[i], i);
            }

            // Return null if no such numbers exist
            return null;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
