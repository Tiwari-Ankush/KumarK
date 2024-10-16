problem:
Alice likes numbers which are even, and are a multiple of 7.
Bob likes numbers which are odd, and are a multiple of 9.
Alice, Bob, and Charlie find a number 
�
A.

If Alice likes 
�
A, Alice takes home the number.
If Bob likes 
�
A, Bob takes home the number.
If both Alice and Bob don't like the number, Charlie takes it home.
Given 
�
A, find who takes it home.

Note: You can prove that there is no integer 
�
A such that both Alice and Bob like it.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
Each test case consists of a single integer, 
�
A.
Output Format
For each test case, output on a new line who takes the number home - "Alice", "Bob", or "Charlie".

You may print each character in uppercase or lowercase. For example, Alice, alice, aLiCe, and ALICE are all considered identical.

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
≤
1000
1≤A≤1000
Sample 1:
Input
Output
8
7
14
21
18
27
63
126
8
Charlie
Alice
Charlie
Charlie
Bob
Bob
Alice
Charlie
Explanation:
Testcase 1: 7 is not even, hence Alice doesn't like it. It is odd, but isn't a multiple of 9. Hence Bob doesn't like it. Therefore, Charlie takes it home.

Testcase 2: 14 is even and a multiple of 7. Therefore, Alice likes it and takes it home.

Testcase 3: 21 is not even, hence Alice doesn't like it. It is odd, but isn't a multiple of 9. Hence Bob doesn't like it. Therefore, Charlie takes it home.

Testcase 4: 18 is even but not a multiple of 7, hence Alice doesn't like it. It is not odd, and hence Bob doesn't like it. Therefore, Charlie takes it home.

Testcase 5: 27 is odd and a multiple of 9. Therefore, Bob likes it and takes it home.

Testcase 6: 63 is odd and a multiple of 9. Therefore, Bob likes it and takes it home.

Testcase 7: 126 is even and a multiple of 7. Therefore, Alice likes it and takes it home.

Testcase 8: 8 is even but not a multiple of 7, hence Alice doesn't like it. It is not odd, and hence Bob doesn't like it. Therefore, Charlie takes it home.


solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        // Loop through each test case
        while (t-- > 0) {
            // Read the value of A for each test case
            int n = scanner.nextInt();

            // Check the preferences of Alice, Bob, and Charlie
            if (n % 2 == 0 && n % 7 == 0) { // Corrected: Use logical AND (&&) instead of bitwise AND (&)
                System.out.println("Alice");
            } else if (n % 2 != 0 && n % 9 == 0) { // Corrected: Use logical AND (&&) instead of bitwise AND (&)
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
    }
}

```


