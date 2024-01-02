problem:
Chef's phone has a total storage of 
�
S MB. Also, Chef has 
2
2 apps already installed on his phone which occupy 
�
X MB and 
�
Y MB respectively.

He wants to install another app on his phone whose memory requirement is 
�
Z MB. For this, he might have to delete the apps already installed on his phone. Determine the minimum number of apps he has to delete from his phone so that he has enough memory to install the third app.

Input Format
The first line contains a single integer 
�
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains four integers 
�
,
�
,
�
S,X,Y and 
�
Z — the total memory of Chef's phone, the memory occupied by the two already installed apps and the memory required by the third app.
Output Format
For each test case, output the minimum number of apps Chef has to delete from his phone so that he can install the third app.

Constraints
1
≤
�
≤
1000
1≤T≤1000
1
≤
�
≤
500
1≤S≤500
1
≤
�
≤
�
≤
�
1≤X≤Y≤S
�
+
�
≤
�
X+Y≤S
�
≤
�
Z≤S
Sample 1:
Input
Output
4
10 1 2 3
9 4 5 1
15 5 10 15
100 20 30 75
0
1
2
1
Explanation:
Test Case 1: The unused memory in the phone is 
7
7 MB. Therefore Chef can install the 
3
3 MB app without deleting any app.

Test Case 2: There is no unused memory in the phone. Chef has to first delete one of the apps from the phone and then only he can install the 
1
1 MB app.

Test Case 3: There is no unused memory in the phone. Chef has to first delete both the apps from the phone and then only he can install the 
15
15 MB app.

Test Case 4: The unused memory in the phone is 
50
50 MB. Chef has to first delete the 
30
30 MB app from the phone and then only he can install the 
75
75 MB app.




soln:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if((s - (x + y)) >= z) 
            {
                System.out.println(0);
            }
            else if((s - (x + y)) < z) 
            {
                int rem = s - (x + y);
                int req = z - rem;
                
                int max = Math.max(x, y);
                
                if(max < req)
                    System.out.println(2);
                else
                    System.out.println(1);
            }
        }
    }
}
"