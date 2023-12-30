problem:

1897. Redistribute Characters to Make All Strings Equal
Easy
836
61
Companies
You are given an array of strings words (0-indexed).

In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].

Return true if you can make every string in words equal using any number of operations, and false otherwise.

 

Example 1:

Input: words = ["abc","aabc","bc"]
Output: true
Explanation: Move the first 'a' in words[1] to the front of words[2],
to make words[1] = "abc" and words[2] = "abc".
All the strings are now equal to "abc", so return true.
Example 2:

Input: words = ["ab","a"]
Output: false
Explanation: It is impossible to make all the strings equal using the operation.
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters.


soln:

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character in all words
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Check if the count of each character is divisible by the number of words
        int numWords = words.length;
        for (int count : charCount.values()) {
            if (count % numWords != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example 1
        String[] words1 = {"abc", "aabc", "bc"};
        System.out.println(makeEqual(words1)); // Output: true

        // Example 2
        String[] words2 = {"ab", "a"};
        System.out.println(makeEqual(words2)); // Output: false
    }
}
