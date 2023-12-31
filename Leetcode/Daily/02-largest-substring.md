problme:
Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.
Example 2:

Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".
Example 3:

Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s.
 

Constraints:

1 <= s.length <= 300
s contains only lowercase English letters.


soln:
```
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxSubstringLength = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    int substringLength = j - i - 1;
                    maxSubstringLength = Math.max(maxSubstringLength, substringLength);
                }
            }
        }

        return maxSubstringLength;
    }
}
```


explanation:
Explanation:

maxLengthBetweenEqualCharacters method: This is the main method that calculates the length of the longest substring between two equal characters.

maxSubstringLength: This variable is used to keep track of the maximum substring length found during the iterations.

Outer Loop (for (int i = 0; i < s.length(); i++)): Iterates over each character in the string.

Inner Loop (for (int j = s.length() - 1; j > i; j--)): Iterates in reverse from the end of the string to the current character.

Check for Equal Characters (if (s.charAt(i) == s.charAt(j))): Checks if the characters at positions i and j are equal.

Calculate Substring Length: Calculates the length of the substring between two equal characters (int substringLength = j - i - 1).

Update maxSubstringLength: Updates maxSubstringLength with the maximum length found so far using Math.max.

Return Result: Returns the final result, which represents the length of the longest substring between two equal characters.
