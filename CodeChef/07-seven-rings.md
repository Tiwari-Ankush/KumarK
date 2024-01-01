prob:

In Chefland, a valid phone number consists of 
5
5 digits with no leading zeros.
For example, 
98765
,
10000
,
98765,10000, and 
71023
71023 are valid phone numbers while 
04123
,
9231
,
04123,9231, and 
872310
872310 are not.

Chef went to a store and purchased 
�
N items, where the cost of each item is 
�
X.
Find whether the total bill is equivalent to a valid phone number.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
Each test case consists of two space-separated integers 
�
N and 
�
X — the number of items Chef bought and the cost per item.
Output Format
For each test case, output on a new line, YES, if the total bill is equivalent to a valid phone number and NO otherwise.

Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

Constraints
1
≤
�
≤
100
1≤T≤100
1
≤
�
,
�
≤
1000
1≤N,X≤1000
Sample 1:
Input
Output
4
25 785
402 11
100 100
333 333
YES
NO
YES
NO
Explanation:
Test case 
1
1: Chef bought 
25
25 items, each with cost 
785
785. The total bill is thus, 
25
⋅
785
=
19625
25⋅785=19625. Since the total bill amount is 
5
5 digits with no leading zeros, it is equivalent to a valid phone number.

Test case 
2
2: Chef bought 
402
402 items, each with cost 
11
11. The total bill is thus, 
402
⋅
11
=
4422
402⋅11=4422. Since the total bill amount is of 
4
4 digits, it is not equivalent to a valid phone number.

Test case 
3
3: Chef bought 
100
100 items, each with cost 
100
100. The total bill is thus, 
100
⋅
100
=
10000
100⋅100=10000. Since the total bill amount is 
5
5 digits with no leading zeros, it is equivalent to a valid phone number

Test case 
4
4: Chef bought 
333
333 items, each with cost 
333
333. The total bill is thus, 
333
⋅
333
=
110889
333⋅333=110889. Since the total bill amount is of 
6
6 digits, it is not equivalent to a valid phone number.




soln:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            // Your code goes here
            long totalBill = (long) n * x;  // Use long to handle larger values

            // Convert the number to a string to check its length
            String billNo = Long.toString(totalBill);

            // Check for a 5-digit number without leading zeros
            if (billNo.length() == 5 && billNo.charAt(0) != '0') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}

```



explanation:

The problem statement describes a scenario in Chefland where a valid phone number consists of 5 digits with no leading zeros. Chef went to a store and purchased N items, where the cost of each item is X. The task is to find whether the total bill is equivalent to a valid phone number.

The input contains the number of test cases (T), and each test case consists of two integers N and X, representing the number of items Chef bought and the cost per item, respectively.

For each test case, the output should be "YES" if the total bill is equivalent to a valid phone number and "NO" otherwise. The total bill is calculated by multiplying the number of items (N) with the cost per item (X).

The constraints are:
- 1 ≤ T ≤ 100 (the number of test cases)
- 1 ≤ N, X ≤ 1000 (the number of items and the cost per item)

The sample explains four test cases, and for each test case, it checks whether the total bill has 5 digits with no leading zeros. If so, it is considered a valid phone number; otherwise, it is not.

Example:
- Test case 1: Chef bought 25 items with a cost of 785 each. The total bill is 25 * 785 = 19625. Since it has 5 digits with no leading zeros, the output is "YES."

- Test case 2: Chef bought 402 items with a cost of 11 each. The total bill is 402 * 11 = 4422. Since it has 4 digits, the output is "NO."

- Test case 3: Chef bought 100 items with a cost of 100 each. The total bill is 100 * 100 = 10000. Since it has 5 digits with no leading zeros, the output is "YES."

- Test case 4: Chef bought 333 items with a cost of 333 each. The total bill is 333 * 333 = 110889. Since it has 6 digits, the output is "NO."

