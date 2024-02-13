basic steps to approach the DP problem:

1 . create an emppty dp[] --> N array.
2 . find dp[1], dp[2], dp[3] by basic observation.
3 . now create a general formula.
4 . now find dp[1] ... dp[n] using loop and the general formula.
5 . dp[n] in general is the final answer.


**Problem-{2}**:- Understanding this problem and its solution properly will make a strong foundation for you in the DP world! (This worked for me :-) )

Here we go :   Given an array of integers(positive as well as negative) ,select some elements from this array(select a subset) such that:-

1. Sum of those elements is maximum(Sum of the subset is maximum) .

2. No two elements in the subset should be consecutive.

Example :- {2,4,6,7,8}

Answer:- {2+6+8=16}

Common Trick : We create a dp-array , and dp[i] means the maximum sum we could get till index-’i’ of the array.

For the above example,

dp[1] = 2 (2), [This is the best answer you could get if size of the array was one]

dp[2]= 4(4),[This is the best answer you could get if size of the array was two]

dp[3]=8(6+2),[This is the best answer you could get if size of the array was three]………lets call this equation-(1)…

dp[4]=11(7+4),[This is the best answer you could get if size of the array was four]

dp[5]=16(2+6+8),[[This is the best answer you could get if size of the array was five]

Now , the next thing that I am going to say, you gotta feel it deeply . If you are able to do it, you win!!

Say, I have calculated dp[1],dp[2] and dp[3] by pure observation. Now, I have to calculate dp[4].

So I have only 2 choices:-

Choice : i)Include the 4'th element , if I do this, I can’t include the 3rd element as consecutive elements are not allowed, so ,

--->dp[4]= a[4]+dp[2]…..(answer will be 4th element plus the best answer till index ‘2’ of the array)

Choice : ii)Exclude the 4th element, we don’t select it! So the previous answer is the current answer, we don’t change anything,

--->dp[4]=dp[3],

Final answer is the maximum of two choices :-> dp[4]=maximum(a[4]+dp[2],dp[3])

=maximum(7+4,8)

=maximum(11,8)

=11…..(verify this with equation…(1))

Voila, we did it !!!

So, the recurrence relation for this problem is, for any ‘i’ ,

--->dp[i]=max(a[i]+dp[i-2],dp[i-1])

We will calculate dp[i] for all ‘i’ from (1 to n) using the above formula.

And dp[n] will be the maximum possible sum for the whole array!!
