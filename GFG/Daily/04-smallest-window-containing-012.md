prob:
Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

Example 1:

Input:
S = 01212
Output:
3
Explanation:
The substring 012 is the smallest substring
that contains the characters 0, 1 and 2.
Example 2:

Input: 
S = 12121
Output:
-1
Explanation: 
As the character 0 is not present in the
string S, therefor no substring containing
all the three characters 0, 1 and 2
exists. Hence, the answer is -1 in this case.
Your Task:
Complete the function smallestSubstring() which takes the string S as input, and returns the length of the smallest substring of string S that contains all the three characters 0, 1 and 2.

Expected Time Complexity: O( length( S ) )
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ length( S ) ≤ 105
All the characters of String S lies in the set {'0', '1', '2'}



soln
```
import java.util.Arrays;

class Solution {
    public int smallestSubstring(String S) {
        int[] count = new int[3];
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;

        while (right < S.length()) {
            count[S.charAt(right) - '0']++;
            right++;

            // Check if the current substring contains all three characters
            boolean containsAll = true;
            for (int c : count) {
                if (c == 0) {
                    containsAll = false;
                    break;
                }
            }

            while (containsAll) {
                minLen = Math.min(minLen, right - left);

                // Move the left pointer to make the substring smaller
                count[S.charAt(left) - '0']--;
                left++;

                // Check again if the updated substring contains all three characters
                for (int c : count) {
                    if (c == 0) {
                        containsAll = false;
                        break;
                    }
                }
            }
        }

        // If no substring containing all three characters is found, return -1
        return (minLen == Integer.MAX_VALUE) ? -1 : minLen;
    }
}
```

