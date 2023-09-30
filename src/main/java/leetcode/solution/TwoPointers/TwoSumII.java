// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package leetcode.solution.TwoPointers;

import java.util.Arrays;

public class TwoSumII {

    static class Solution {
        /**
         * Finds two numbers in an array that add up to a target value.
         *
         * @param  numbers	the array of numbers
         * @param  target	the target value
         * @return         	an array containing the indices of the two numbers
         */
        public int[] twoSum(int[] numbers, int target) {
            int left = 0, right = numbers.length - 1;

            while (numbers[left] + numbers[right] != target) {
                if (numbers[left] + numbers[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }

            return new int[]{left + 1, right + 1};
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
