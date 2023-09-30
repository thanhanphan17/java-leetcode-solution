package leetcode.solution.TwoPointers;

public class ContainerWithMostWater {
    static class Solution {
        /**
         * Calculates the maximum area of a container formed by the given heights.
         *
         * @param  height   an array of heights
         * @return          the maximum area of the container
         */
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int maxArea = 0;

            while (left < right) {
                int area = Math.min(height[left], height[right]) * (right - left);
                maxArea = Math.max(maxArea, area);

                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return maxArea;
        }
    }

    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(new Solution().maxArea(height));
    }
}
