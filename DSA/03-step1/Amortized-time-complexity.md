# AMORTIZED TIME COMPLEXITY

Amortized complexity is used when algorithms have expensive operations that occur rarely. Amortized time complexity is the "Expected Time Complexity" used to express time complexity when an algorithm has expensive worst-case time complexity.

**Worst-case time complexity for N insertions is O(N^2).**

### Two Cases for Insertion in Dynamic Array

1. **When there exists free space in the array.**
   - Time complexity here is O(1).

2. **When there is no space, a new array is to be created of size double the original array, the elements in the original array are to be copied, and the new element is inserted.**
   - Time complexity here is:
     *Creation of a new array of double the original size + Copying the elements of the original array + Insertion of the new element* --> **O(2N) + O(N) + O(1) = O(3N+1)**

Amortized analysis averages the running times of operations in a sequence.

---

# QUESTIONS AND ANSWERS

1. **What is Amortized time complexity?**
   - Amortized time complexity is the "Expected Time Complexity" used to express time complexity when an algorithm has expensive worst-case time complexity.

2. **What is the difference between normal and amortized time complexity?**
   - Normal time complexity expresses the worst-case scenario for a single operation, while amortized time complexity considers the average time for a sequence of operations, smoothing out the impact of occasional expensive operations.

3. **Understanding amortization using Dynamic Array? Give with an example.**
   - When inserting into a dynamic array, the time complexity is O(1) when there is free space, and O(3N+1) when a new array needs to be created. Amortized analysis considers the average time over a sequence of operations.

4. **What is worst-case time complexity?**
   - Worst-case time complexity expresses the maximum time required for an algorithm to complete, considering the least favorable input.

5. **Tell me the worst-time complexity for N insertions.**
   - The worst-time complexity for N insertions in the provided scenario is O(N^2).

6. **What does amortized analysis do? And how? Give with an example.**
   - Amortized analysis averages the running times of operations in a sequence. In the dynamic array example, even though some insertions are expensive (O(3N+1)), the average cost over a sequence of insertions is amortized to O(1).

---

# Amortized Complexity for Dynamic Arrays

Assume there would be m appends.

Hence the cost of m appends would be m since we are appending m elements (the append operation would cost O(1)) plus the cost of doubling when the array needs to grow.

Let's calculate the cost of doubling the array: 

The first doubling costs 1, the second doubling costs 2, the third doubling costs 4...and so on.

⇒ 1 + 2 + 4 + 6 + 8 + ... + m/2 + m

It's easier to solve the above equation if we reverse it.

⇒ m + m/2 + ... + 8 + 6 + 4 + 2 + 1

The highlighted box equals m summing the total to 2m.

Hence keeping everything together appends cost (m) and doubling costs (2m). The total sum would be 3m i.e., O(m).

Therefore, m appends cost O(m). So each append costs O(1).

This is the amortized complexity for dynamic arrays.
