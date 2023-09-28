// https://leetcode.com/problems/contains-duplicate/
package leetcode.solution;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    static class Solution {
        /**
         * Checks if an array contains any duplicate elements.
         *
         * @param nums the input array
         * @return true if the array contains duplicates, false otherwise
         */
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> numsSet = new HashSet<>();

            for (int num : nums) {
                if (!numsSet.add(num)) {
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
