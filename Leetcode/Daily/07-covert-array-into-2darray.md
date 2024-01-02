probkem:
You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

The 2D array should contain only the elements of the array nums.
Each row in the 2D array contains distinct integers.
The number of rows in the 2D array should be minimal.
Return the resulting array. If there are multiple answers, return any of them.

Note that the 2D array can have a different number of elements on each row.

 

Example 1:

Input: nums = [1,3,4,1,2,3,1]
Output: [[1,3,4,2],[1,3],[1]]
Explanation: We can create a 2D array that contains the following rows:
- 1,3,4,2
- 1,3
- 1
All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
It can be shown that we cannot have less than 3 rows in a valid array.
Example 2:

Input: nums = [1,2,3,4]
Output: [[4,3,2,1]]
Explanation: All elements of the array are distinct, so we can keep all of them in the first row of the 2D array.
 

Constraints:

1 <= nums.length <= 200
1 <= nums[i] <= nums.length



solution:

```
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // Initialize the result list to store the rows of the matrix
        List<List<Integer>> result = new ArrayList<>();
        
        // Iterate through each number in the input array
        for (int num : nums) {
            boolean added = false;
            
            // Iterate through each existing row in the result
            for (int i = 0; i < result.size(); i++) {
                List<Integer> row = result.get(i);
                
                // Check if the current number is not already in the row
                if (!row.contains(num)) {
                    // Add the current number to the row
                    row.add(num);
                    added = true;
                    // Break out of the inner loop
                    break;
                }
            }
            
            // If the number couldn't be added to any existing row, create a new row
            if (!added) {
                List<Integer> newRow = new ArrayList<>();
                newRow.add(num);
                // Add the new row to the result
                result.add(newRow);
            }
        }
        
        // Return the final result containing distinct elements in each row
        return result;
    }
}
```


