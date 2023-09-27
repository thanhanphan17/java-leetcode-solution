// https://leetcode.com/problems/median-of-two-sorted-arrays/description/
package leetcode.solution;

public class MedianOfTwoSortedArrays {
    static class Solution {
        /**
         * Calculates the median of two sorted arrays.
         *
         * @param nums1 The first sorted array.
         * @param nums2 The second sorted array.
         * @return The median of the two arrays.
         */
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int len1 = nums1.length;
            int len2 = nums2.length;
            int[] nums = new int[len1 + len2];
            int i = 0, j = 0, k = 0;

            // Merge the two sorted arrays into a single sorted array
            while (i < len1 && j < len2) {
                nums[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
            }
            while (i < len1) {
                nums[k++] = nums1[i++];
            }
            while (j < len2) {
                nums[k++] = nums2[j++];
            }

            int mid = (len1 + len2) / 2;

            // Calculate the median based on the length of the merged array
            if ((len1 + len2) % 2 == 1) {
                return nums[mid];
            } else {
                return (nums[mid - 1] + nums[mid]) / 2.0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 5};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}
