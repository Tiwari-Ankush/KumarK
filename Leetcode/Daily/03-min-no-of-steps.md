sstmt:
You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.

Return the minimum number of steps to make t an anagram of s.

An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

 

Example 1:

Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
Example 2:

Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
Example 3:

Input: s = "anagram", t = "mangaar"
Output: 0
Explanation: "anagram" and "mangaar" are anagrams. 
 

Constraints:

1 <= s.length <= 5 * 104
s.length == t.length
s and t consist of lowercase English letters only.




solution:
```
class Solution {
    public int minSteps(String s, String t) {
        int[] frequencyS = new int[26];
        int[] frequencyT = new int[26];

        for (char ch : s.toCharArray()) {
            frequencyS[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            frequencyT[ch - 'a']++;
        }

        int minSteps = 0;

        for (int i = 0; i < 26; i++) {
            if (frequencyT[i] < frequencyS[i]) {
                minSteps += (frequencyS[i] - frequencyT[i]);
            }
        }

        return minSteps;
    }
}

```


explanation:

minSteps method: This is the main method that calculates the minimum number of steps to make t an anagram of s.

frequencyS and frequencyT: These arrays are used to store the frequency of characters for strings s and t.

Calculate Frequency of Characters: Using a loop, calculate the frequency of characters for both strings s and t.

minSteps: This variable is used to keep track of the minimum number of steps needed.

Loop Over Characters: Loop over all characters in the alphabet (from 'a' to 'z').

Check Frequencies: If the frequency of a character in t is less than the frequency in s, add the difference to minSteps.

Return Result: Returns the final result, which represents the minimum number of steps.




more""

```java
// Calculate the frequency of characters for string s.
for (char ch : s.toCharArray()) {
    frequencyS[ch - 'a']++;
}
```

This code is using an array `frequencyS` to store the frequency of each character in the string `s`. Here's how it works:

1. `s.toCharArray()`: This converts the string `s` into an array of characters. For example, if `s = "abc"`, `s.toCharArray()` would be `['a', 'b', 'c']`.

2. `for (char ch : s.toCharArray())`: This is an enhanced for loop that iterates over each character (`ch`) in the array of characters obtained from `s`.

3. `frequencyS[ch - 'a']++`: For each character `ch`, it calculates its position in the alphabet by subtracting the ASCII value of 'a'. Since characters in Java are represented as Unicode values, subtracting 'a' gives us an index from 0 to 25. It then increments the corresponding position in the `frequencyS` array.

Here's an example:

Suppose `s = "aba"`:

- For the first 'a', `ch - 'a'` would be `97 - 97 = 0`, so `frequencyS[0]` is incremented by 1.
- For the 'b', `ch - 'a'` would be `98 - 97 = 1`, so `frequencyS[1]` is incremented by 1.
- For the second 'a', `ch - 'a'` would be `97 - 97 = 0` again, so `frequencyS[0]` is incremented by 1.

After this loop, `frequencyS` would be `[2, 1, 0, ..., 0]` since there are 2 'a's, 1 'b', and 0 occurrences of other characters.

