// https://leetcode.com/problems/binary-search/
package leetcode.solution.BinarySearch;

public class BinarySearch {

    static class Solution {
        /**
         * Performs a binary search on the given array to find the index of the target value.
         *
         * @param  nums     the array of integers to be searched
         * @param  target   the target value to be found
         * @return          the index of the target value in the array, or -1 if it is not found
         */
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{-1,0,3,5,9,12}, 0));
    }
}
