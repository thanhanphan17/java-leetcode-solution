// https://leetcode.com/problems/contains-duplicate/
package leetcode.solution;

import java.util.HashMap;

public class ContainsDuplicate {
    static class Solution {
        /**
         * Checks if an array contains any duplicate elements.
         *
         * @param nums the input array
         * @return true if the array contains duplicates, false otherwise
         */
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> numsMap = new HashMap<>();

            for (int num : nums) {
                if (numsMap.containsKey(num)) {
                    return true;
                }
                numsMap.put(num, 1);
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
