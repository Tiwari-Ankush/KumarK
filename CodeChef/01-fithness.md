prob stmt :
Chef wants to become fit for which he decided to walk to the office and return home by walking. It is known that Chef's office is 
�
X km away from his home.

If his office is open on 
5
5 days in a week, find the number of kilometers Chef travels through office trips in a week.

Input Format
First line will contain 
�
T, number of test cases. Then the test cases follow.
Each test case contains of a single line consisting of single integer 
�
X.
Output Format
For each test case, output the number of kilometers Chef travels through office trips in a week.

Constraints
1
≤
�
≤
10
1≤T≤10
1
≤
�
≤
10
1≤X≤10
Sample 1:
Input
Output
4
1
3
7
10
10
30
70
100
Explanation:
Test case 
1
1: The office is 
1
1 km away. Thus, to go to the office and come back home, Chef has to walk 
2
2 kms in a day. In a week with 
5
5 working days, Chef has to travel 
2
⋅
5
=
10
2⋅5=10 kms in total.

Test case 
2
2: The office is 
3
3 kms away. Thus, to go to the office and come back home, Chef has to walk 
6
6 kms in a day. In a week with 
5
5 working days, Chef has to travel 
6
⋅
5
=
30
6⋅5=30 kms in total.

Test case 
3
3: The office is 
7
7 kms away. Thus, to go to the office and come back home, Chef has to walk 
14
14 kms in a day. In a week with 
5
5 working days, Chef has to travel 
14
⋅
5
=
70
14⋅5=70 kms in total.

Test case 
4
4: The office is 
10
10 kms away. Thus, to go to the office and come back home, Chef has to walk 
20
20 kms in a day. In a week with 
5
5 working days, Chef has to travel 
20
⋅
5
=
100
20⋅5=100 kms in total.




soln:
import java.util.Scanner;

public class ChefOfficeTrips {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Reading the number of test cases
        int t = scanner.nextInt();

        // Loop through each test case
        while (t-- > 0) {
            // Reading the distance to the office for the current test case
            int x = scanner.nextInt();

            // Calculating the total kilometers Chef travels in a week
            // Chef walks to the office and back home every working day (5 days in a week)
            int totalKilometers = 2 * x * 5;

            // Printing the result for the current test case
            System.out.println(totalKilometers);
        }

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}

