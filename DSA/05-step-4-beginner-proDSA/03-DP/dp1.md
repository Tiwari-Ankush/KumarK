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


## Problem-1 :
 We are given an array of integers(a[n]) . We are given multiple queries of the form : (1, i) which means we need to output the sum of all numbers from index- ‘1’ to index ‘i’ of the array.

**Analysis** : Running a loop for each query[O(N)] and finding the sum is a good idea but not very efficient as it takes O(N*Q) time.


Let us create a **dp-array** of size ‘n’.
-->dp[1]=sum of all numbers from (1,1)
-->dp[2]=sum of all numbers from (1,2)…
and so on.


Say, a[5]={4,5,3,2,1}…**(assume 1-based-indexing here)** So, dp[1]=4(pretty easy)…..(1)
dp[2]=4+5=9………(2)
dp[3]=4+5+3=12…..(3) and so on.

So, for any index ‘i’ ,
**Formula for DP** >>

## dp[i]=dp[i-1]+a[i],
**Example:-**
dp[3] = a[3] + dp[3–1] = a[3] + dp[2]= 3 + 9 =12 ….(which is same as equation…(3))