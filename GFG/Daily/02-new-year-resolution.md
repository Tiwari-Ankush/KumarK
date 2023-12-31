problem:

As the clock struck midnight on New Year's Eve, Geek bid farewell to the wasted moments of 2023, realizing the untapped potential of GFG's Problem of the Day.

His 2024 resolution: Solve POTD every day.

Eager to earn coins for GFG Merchandise, Geek faces new rules:

Earning Coin: Geek can accumulate coins[i] by solving the POTD on the ith day, where 1 <= coins[i] <= 2024 and the sum of coins <= 2024.
Merchandise Eligibility: To purchase merchandise, the coins earned must be divisible by 20 or 24, or precisely equal to 2024.
Geek's resolutions often fades over time. Realistically, he can only commit to active participation for N (where N ≤ 366) days. Given the value of N and number of coins associated with each POTD, can Geek strategically solve some (or all) POTDs to become eligible for redeeming merchandise?

Example 1:

Input:
N = 8
coins = [5, 8, 9, 10, 14, 2, 3, 5]

Output: 1

Explanation:
Geek can fulfill the criteria in many ways.
One such way is to solve POTD on 4th and 5th day.
Another way is to solve POTD on 1st, 4th and 8th day.
Example 2:

Input:
N = 5
coins = [1, 2, 3, 4, 5]

Output: 0

Explanation: There is no way Geek can become eligible.
Your Task: 
You don't need to read input or print anything. Complete the function isPossible() which takes n and coins[ ] as input parameters and returns a boolean value.

Expected Time Complexity: O(N*(Sum of coins))
Expected Auxiliary Space: O(N*(Sum of coins))

Constraints:
1 <= N <= 366
1 <= coins[i] <= 2024
1 <= Sum of coins <=  2024



soln:

```

class Solution {
    public static boolean isPossible(int N, int[] coins) {
        return helper(0, coins, N, 0);
    }

    public static boolean helper(int idx, int[] coins, int n, int sum) {
        if (sum != 0 && (sum % 2024 == 0 || sum % 20 == 0 || sum % 24 == 0)) {
            return true;
        }
        if (idx == n) {
            return false;
        }

        boolean temp1 = helper(idx + 1, coins, n, sum + coins[idx]);
        if (temp1) return true;

        boolean temp2 = helper(idx + 1, coins, n, sum);
        return temp2;
    }
}

```



explanation:

Certainly! Let's go through the code with comments to explain its logic:

```java
class Solution {
    // Main function to check if it's possible to accumulate coins for merchandise eligibility
    public static boolean isPossible(int N, int[] coins) {
        // Call the helper function to perform the recursive check
        return helper(0, coins, N, 0);
    }

    // Recursive helper function to explore different possibilities of accumulating coins
    public static boolean helper(int idx, int[] coins, int n, int sum) {
        // Check if the current sum satisfies merchandise eligibility conditions
        if (sum != 0 && (sum % 2024 == 0 || sum % 20 == 0 || sum % 24 == 0)) {
            return true; // If yes, return true
        }
        
        // Base case: if we have processed all coins, return false
        if (idx == n) {
            return false;
        }

        // Recursive call 1: Include the current coin and update the sum
        boolean temp1 = helper(idx + 1, coins, n, sum + coins[idx]);
        // If including the coin leads to a valid solution, return true
        if (temp1) return true;

        // Recursive call 2: Exclude the current coin and keep the sum unchanged
        boolean temp2 = helper(idx + 1, coins, n, sum);
        // If excluding the coin leads to a valid solution, return true
        return temp2;
    }
}
```

Explanation:

- The `isPossible` function initiates the recursive process by calling the helper function with the initial parameters.
- The `helper` function explores two possibilities for each coin: including it in the sum or excluding it.
- It checks if the current sum satisfies merchandise eligibility conditions. If yes, it returns true.
- The base case ensures that we don't go beyond the last coin.
- The recursive calls explore different combinations of including and excluding coins to find a valid solution. If any of these paths lead to a valid solution, the function returns true.

Note: While this recursive approach is valid, it may not be efficient for large inputs. Dynamic programming or memoization can be applied to optimize the solution.

