
# Time Complexity Using Loops

## First Example: \(i = 1\) to \(i \leq n\)

### Explanation:
In this example, there is a single loop where the variable \(i\) starts from 1 and continues until \(i\) is less than or equal to \(n\). The loop runs \(n\) times, contributing to a time complexity of \(O(n)\).

```cpp
for (int i = 1; i <= n; ++i) {
    // Code inside the loop
}
```

## Second Example: \(i = 1\) to \(i \leq n\), \(j = 1\) to \(j \leq n\)

### Explanation:
Here, we have nested loops. The outer loop runs \(n\) times, and for each iteration of the outer loop, the inner loop runs \(n\) times as well. As a result, the overall time complexity is \(O(n^2)\).

```cpp
for (int i = 1; i <= n; ++i) {
    for (int j = 1; j <= n; ++j) {
        // Code inside the inner loop
    }
}
```

## Third Example: \(i = 1\) to \(i \leq n\), \(j = i\) to \(j \leq n\)

### Explanation:
This example has nested loops, similar to the second example. However, the inner loop starts from \(i\) instead of 1. As a result, the inner loop runs \(n-i+1\) times for each iteration of the outer loop. The overall time complexity is \(O\left(\frac{n \cdot (n+1)}{2}\right)\), which simplifies to \(O(n^2)\) in the worst case.

```cpp
for (int i = 1; i <= n; ++i) {
    for (int j = i; j <= n; ++j) {
        // Code inside the inner loop
    }
}
```



Rules:
1. *When we have polynomial type of thing so while finding a time complexity then we will always ignore the lowest order variable term.*

2. *We will also ignore the constants*
    _that means: if **[((n^2)/2)+(n/2)]** in this order of polynomial is 2, lowest order variable is **(n/2)** so we neglect it and after removing constant also, we got **n^2** as a complexity._

*Time complexity can be constant.**O(const)***

**Formal Defination**:
*T(n) is a directly proportional function.*
*T(n) --> tells us the execution time of an algorithm*
*T(n) provides an estimation that how the running time will increase with increase in size of n*
_**O(logN)**--> running time increasaes logarithmically with the input size_
_**O(N)** --> running time increases linearly with the input size_
_**O(N^2)** --> running time increases quadratically with the input size_
_**O(2^n)** --> running time increases exponentially with the input size_

**O** --> _represents the worst case time complexity, we called it **Big-oh**_


**questions?**
### 1. Why do we ignore constants and lowest order variables when time complexity is a polynomial?

Time complexity analysis focuses on the growth rate of algorithms as the input size increases. Ignoring constants and lowest order variables helps simplify the comparison between different algorithms and provides a high-level understanding of their efficiency. Constants may vary based on hardware and implementation details, making them less meaningful for general comparisons. Lowest order variables become less significant as the input size becomes large, and the dominating term in the polynomial determines the overall growth rate. By abstracting away these details, we can focus on the essential factor influencing the scalability of an algorithm.

### 2. What is the order like n^3 > n^2 > n log n > n > log n > (1)?

Consider the following question and answer:

**Question:** Arrange the following time complexities in ascending order based on their growth rate: \( n^3 \), \( n^2 \), \( n \log n \), \( n \), \( \log n \), \( (1) \).

**Answer:**
The time complexities in ascending order are as follows:

1. \( (1) \) - Constant time complexity.
2. \( \log n \) - Logarithmic time complexity.
3. \( n \) - Linear time complexity.
4. \( n \log n \) - Linearithmic time complexity.
5. \( n^2 \) - Quadratic time complexity.
6. \( n^3 \) - Cubic time complexity.

This ordering is based on the relative growth rates of these functions as the input size (\( n \)) increases.

Feel free to ask if you have any further questions or if you'd like additional explanations!


