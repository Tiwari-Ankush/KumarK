problem stmt: 
Chef has 
�
X 5 rupee coins and 
�
Y 10 rupee coins. Chef goes to a shop to buy chocolates for Chefina where each chocolate costs 
�
Z rupees. Find the maximum number of chocolates that Chef can buy for Chefina.

Input Format
The first line contains a single integer 
�
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers 
�
X, 
�
Y and 
�
Z — the number of 5 rupee coins, the number of 10 rupee coins and the cost of each chocolate.
Output Format
For each test case, output the maximum number of chocolates that Chef can buy for Chefina.

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
,
�
≤
1000
1≤X,Y,Z≤1000
Sample 1:
Input
Output
4
10 10 10
3 1 8
8 1 3
4 4 1000
15
3
16
0
Explanation:
Test case 
1
1: Chef has 
10
⋅
5
+
10
⋅
10
=
150
10⋅5+10⋅10=150 rupees in total. Since each chocolate costs 
10
10 rupees, Chef can spend all 
150
150 rupees and buy 
15
15 chocolates for Chefina.

Test case 
2
2: Chef has 
3
⋅
5
+
1
⋅
10
=
25
3⋅5+1⋅10=25 rupees in total. Since each chocolate costs 
8
8 rupees, Chef can buy a maximum of 
3
3 chocolates for Chefina, leaving him with 
1
1 rupee.

Test case 
3
3: Chef has 
8
⋅
5
+
1
⋅
10
=
50
8⋅5+1⋅10=50 rupees in total. Since each chocolate costs 
3
3 rupees, Chef can buy a maximum of 
16
16 chocolates for Chefina, leaving him with 
2
2 rupee.

Test case 
4
4: Chef has 
4
⋅
5
+
4
⋅
10
=
60
4⋅5+4⋅10=60 rupees in total. Since each chocolate costs 
1000
1000 rupees, Chef can buy no chocolate for Chefina, leaving him with 
60
60 rupees.



soln:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // Your code goes here
            
            int chocolates;
            chocolates= ((5*x)+(10*y))/(z);
            System.out.println(chocolates);
        }
    }
}
