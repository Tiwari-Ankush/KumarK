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



approach"

Approach 1: Count Character Frequencies
Intuition

The operation that we are allowed to perform is extremely powerful. We are allowed to move any character to any position in any string. As we are allowed to perform the operation an unlimited number of times, the only thing that matters is the letters we have available to use in words. Given these letters available to us, we can form any combination of words with their letters having any permutation we want.

So, what would it require to make every string equal? There are two requirements for a string to be equal:

The strings must have the same letters with the same frequencies. For example, "aabccc" has two "a", one "b", and three "c".
The letters must be in the same positions.
We don't need to worry about requirement #2 because as we mentioned above, the operation is extremely powerful and we can create any order we want. So the important thing is that we make every string have the same letters with the same frequencies. If one string has five "h", then every other string must also have five "h", for example.

We will start by collecting all the letters available for us to use. We create a hash map counts, where counts[letter] tells us how many times letter appears in the input. We iterate over every word in words, and for each word we iterate over every character c and increment counts[c].

Once we have calculated counts, we analyze each letter's frequency. Let's say that the length of words is n. If a given letter has a frequency of val, we need to allocate val / n copies to each string. This is only possible if val / n is an integer, i.e. val is divisible by n. We can check if val is divisible by n by taking the modulus. If val % n = 0, then val is divisible by n.

If a letter's frequency is divisible by n, we know we can allocate an equal number of copies of this letter to every string. Again, we don't need to worry about the positions mentioned in requirement #2, since we can create any order we want. If every letter's frequency can be evenly allocated, we are guaranteed to make equal strings and the overall task is possible. If ANY letter's frequency cannot be evenly allocated, the task is impossible.

Algorithm

Create a hash map counts.
Iterate over each string word in words:
Iterate over each character c in word:
Increment counts[c].
Set n = words.length.
Iterate over each value val of counts:
If val % n != 0, return false.
Return true.