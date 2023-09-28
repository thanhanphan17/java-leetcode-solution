// https://leetcode.com/problems/longest-palindromic-substring/
package leetcode.solution.ArrayAndHashing;

public class LongestPalindromicSubstring {
    static class Solution {

        /**
         * Finds the longest palindrome substring in a given string.
         *
         * @param s The input string.
         * @return The longest palindrome substring.
         */
        public String longestPalindrome(String s) {
            if (s == null || s.isEmpty()) {
                return s;
            }
            int n = s.length();
            int start = 0;
            int maxLen = 1;
            boolean[][] dp = new boolean[n][n];

            // Initialize the diagonal and the adjacent cells
            for (int i = 0; i < n; i++) {
                dp[i][i] = true;
                if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][i + 1] = true;
                    start = i;
                    maxLen = 2;
                }
            }

            // Fill in the remaining cells
            for (int len = 3; len <= n; len++) {
                for (int i = 0; i <= n - len; i++) {
                    int j = i + len - 1;
                    if (s.charAt(i) == s.charAt(j)) {
                        if (j - i == 1 || dp[i + 1][j - 1]) {
                            dp[i][j] = true;
                            start = i;
                            maxLen = len;
                        }
                    }
                }
            }

            return s.substring(start, start + maxLen);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("thisisinteresting"));
    }
}
