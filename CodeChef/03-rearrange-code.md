Chef has started working at the candy store. The store has 
100
100 chocolates in total.

Chef’s daily goal is to sell 
�
X chocolates. For each chocolate sold, he will get 
1
1 rupee. However, if Chef exceeds his daily goal, he gets 
2
2 rupees per chocolate for each extra chocolate.

If Chef sells 
�
Y chocolates in a day, find the total amount he made.


soln

if (X >= Y) {
    System.out.print(Y);
}
else {
    System.out.print(2*Y - X);
}