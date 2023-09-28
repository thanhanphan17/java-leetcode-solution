// https://leetcode.com/problems/group-anagrams/description/
package leetcode.solution;

import java.util.*;

public class GroupAnagrams {

    static  class Solution {
        /**
         * Groups anagrams in a given array of strings.
         *
         * @param strs The array of strings to group anagrams from.
         * @return A list of lists containing grouped anagrams.
         */
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);

                // Add the word to the list of anagrams corresponding to the sorted word in the map
                // If the sorted word does not exist in the map, create a new list and add the word to it
                map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
            }

            return new ArrayList<>(map.values());
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
