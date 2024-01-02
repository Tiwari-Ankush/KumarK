problem:
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers."

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and 
smallest positive missing number is 2.



soln
```
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];
        
        // Iterate through the array to find the repeating element
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            
            // If the element at absValue index is positive, make it negative
            if (arr[absValue - 1] > 0) {
                arr[absValue - 1] = -arr[absValue - 1];
            } else {
                // If it's already negative, then absValue is the repeating element
                result[0] = absValue;
            }
        }
        
        // Iterate through the array to find the missing element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // If the element is positive, it means its index + 1 is the missing element
                result[1] = i + 1;
                break;
            }
        }
        
        return result;
    }
}

```