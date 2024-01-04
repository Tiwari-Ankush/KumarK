probkem:
Given an array of integers arr[] of length N, every element appears thrice except for one which occurs once.
Find that element which occurs once.

Example 1:

Input:
N = 4
arr[] = {1, 10, 1, 1}
Output:
10
Explanation:
10 occurs once in the array while the other
element 1 occurs thrice.
Example 2:

Input:
N = 10
arr[] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1}
Output:
3
Explanation:
All elements except 3 occurs thrice in the array.
Your Task:
You do not need to take any input or print anything. You task is to complete the function singleElement() which takes an array of integers arr and an integer N which finds and returns the element occuring once in the array.

Constraints:
1 ≤ N ≤ 105
-109 ≤ A[i] ≤ 109

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).



soln:
```
class Solution {
    static int singleElement(int[] arr, int N) {
        int result = 0;

        // Iterate through each bit position
        for (int i = 0; i < 32; i++) {
            int count = 0;

            // Count the number of set bits at the current position for all elements
            for (int num : arr) {
                if (((num >> i) & 1) == 1) {
                    count++;
                }
            }

            // If the count is not divisible by 3, set the bit in the result
            if (count % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
```


explanational logic:
Certainly! The problem is to find the element that occurs exactly once in an array where every other element occurs thrice. The solution utilizes bitwise manipulation to achieve this efficiently. Here's the theoretical logic:

### Theoretical Logic:

1. **Bitwise Counting:**
   - For each bit position (32 bits in the case of integers), count the number of set bits (1s) at that position for all elements in the array.
   - Initialize a variable `result` to store the final result.

2. **Determine the Single Element:**
   - Iterate through each bit position and check if the count of set bits at that position is not divisible by 3.
   - If the count is not divisible by 3, set the corresponding bit in the `result` variable.

3. **Construct the Result:**
   - After iterating through all bit positions, the `result` variable will contain the bits representing the element occurring once.

4. **Return the Result:**
   - The `result` variable now represents the element occurring once. Return this value as the final result.

### Explanation:

- In a binary system, adding 1 to a bit with a count not divisible by 3 will result in a bit that represents the element occurring once.
- The logic iterates through each bit position, counts the set bits, and constructs the result by setting the bits where the count is not divisible by 3.
- This approach ensures that the result contains only the bits of the element occurring once, while the other elements' bits cancel out due to their occurrences being multiples of 3.

### Time and Space Complexity:

- **Time Complexity:** The algorithm iterates through each bit position and counts the bits for all elements once. The time complexity is O(N), where N is the number of elements in the array.
  
- **Space Complexity:** The space complexity is O(1) as the algorithm uses a constant amount of space regardless of the input size.
