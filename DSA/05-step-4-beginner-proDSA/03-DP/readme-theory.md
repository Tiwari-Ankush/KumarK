Dynamic Programming:
**To find solution to a problem, we _divide_ the problem into sub-problems, find answers to those sub-problems , combine them to get the original answer!**

Example:- Say I ask you to calculate :- (1+2+3+4+5) You do this:-   
1)Break it into sub-problems : (1+2)+(3+4)+(5)
2) Find answers to those sub-problems: (3) + (7) + (5) 
3) Combine them to get the answer to the original problem : 15.



## KUMAR K personal trick for DP:
-->dp[i] usually mean the best answer to the problem till the i’th index of the array.

-->Obviously, final answer will be dp[n](where 'n' is the size of the array)

-->We cannot calculate dp[n] directly, we first need to calculate dp[1],dp[2],… and combine their results to find the value of dp[n].