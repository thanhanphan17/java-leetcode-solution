// https://leetcode.com/problems/valid-anagram/description/
package leetcode.solution;

public class ValidAnagram {

    static class Solution {
        /**
         * Checks if two strings are anagrams of each other.
         *
         * @param s the first string
         * @param t the second string
         * @return true if the strings are anagrams, false otherwise
         */
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            int[] count= new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }
}
