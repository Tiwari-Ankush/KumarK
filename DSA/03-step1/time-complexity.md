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

**O** --> _represents the worst case time complexity, we called it Big-oh_


**questions?**
1. why we ignore the constants and lowest order variables when time complexity is a polynomial?

2. what is the order like n^3>n^2>nlogn>n>logn>(1)? givve me proper question also for this question along with answer.


