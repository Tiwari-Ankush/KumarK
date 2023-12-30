Given 
�
,
�
,
A,B, and 
�
C as the sides of a triangle, find whether the triangle is scalene.

Note:

A triangle is said to be scalene if all three sides of the triangle are distinct.
It is guaranteed that the sides represent a valid triangle.
Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
Each test case consists of three space-separated integers 
�
,
�
,
A,B, and 
�
C — the length of the three sides of the triangle.
Output Format
For each test case, output on a new line, YES, if the triangle is scalene, and NO otherwise.

You may print each character of the string in uppercase or lowercase. For example, YES, yes, Yes, and yEs are all considered identical.

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
�
≤
�
≤
10
1≤A≤B≤C≤10
�
<
(
�
+
�
)
C<(A+B)
Sample 1:
Input
Output
4
2 3 4
1 2 2
2 2 2
3 5 6
YES
NO
NO
YES
Explanation:
Test case 
1
1: The side lengths are 
2
,
3
,
2,3, and 
4
4. Since no two side lengths are equal, the triangle is scalene.

Test case 
2
2: The side lengths are 
1
,
2
,
1,2, and 
2
2. The sides 
�
B and 
�
C have the same length. Thus, the triangle is not scalene.

Test case 
3
3: The side lengths are 
2
,
2
,
2,2, and 
2
2. The sides 
�
,
�
,
A,B, and 
�
C have the same length. Thus, the triangle is not scalene.

Test case 
4
4: The side lengths are 
3
,
5
,
3,5, and 
6
6. Since no two side lengths are equal, the triangle is scalene.




soln:

Yes, your code is mostly correct, but there's a small issue with the method call. Since `isScalane` is a method that returns `void` (i.e., it doesn't return any value), you don't need to assign its result to a variable. You should directly call it within the loop. Here's the corrected version:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int c1 = scanner.nextInt();
            
            // Call the function directly within the loop
            isScalane(a1, b1, c1);
        }
        
        // Close the scanner
        scanner.close();
    }

    public static void isScalane(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This version directly calls the `isScalane` method within the loop without assigning its result to any variable. Also, I added the `scanner.close()` statement to close the scanner after using it.