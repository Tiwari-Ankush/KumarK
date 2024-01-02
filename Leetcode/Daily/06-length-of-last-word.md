problem:

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.


soln:

```

class Solution {
    public int lengthOfLastWord(String s) {
        // Split the string by wide spaces and store the words in an array
        String[] words = s.trim().split("\\s+");

        // Check if there are any words in the array
        if (words.length == 0) {
            return 0;
        }

        // Retrieve the last word from the array and return its length
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}

```


extra:

This code trims the input string to remove leading and trailing spaces and then splits it using the regular expression "\s+" which represents one or more whitespace characters. It then checks if there are any words in the array, and if so, it retrieves the last word and returns its length. If there are no words, it returns 0.