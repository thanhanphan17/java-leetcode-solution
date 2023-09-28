// https://leetcode.com/problems/valid-palindrome/description/
package leetcode.solution.TwoPointers;

public class ValidPalindrome {
    static class Solution {

        /**
         * Checks if a given string is a palindrome.
         *
         * @param s The string to check.
         * @return True if the string is a palindrome, false otherwise.
         */
        public boolean isPalindrome(String s) {
            if (s.isEmpty()) {
                return true;
            }

            int start = 0;
            int last = s.length() - 1;

            while (start <= last) {
                char currFirst = s.charAt(start);
                char currLast = s.charAt(last);
                if (!Character.isLetterOrDigit(currFirst)) {
                    start++;
                } else if (!Character.isLetterOrDigit(currLast)) {
                    last--;
                } else {
                    if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                        return false;
                    }
                    start++;
                    last--;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
