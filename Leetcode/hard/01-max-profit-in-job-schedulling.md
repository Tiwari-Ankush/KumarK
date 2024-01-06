
1235. Maximum Profit in Job Scheduling


problem:
We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i], obtaining a profit of profit[i].

You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there are no two jobs in the subset with overlapping time range.

If you choose a job that ends at time X you will be able to start another job that starts at time X.

 

Example 1:



Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
Output: 120
Explanation: The subset chosen is the first and fourth job. 
Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
Example 2:



Input: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
Output: 150
Explanation: The subset chosen is the first, fourth and fifth job. 
Profit obtained 150 = 20 + 70 + 60.
Example 3:



Input: startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
Output: 6
 

Constraints:

1 <= startTime.length == endTime.length == profit.length <= 5 * 104
1 <= startTime[i] < endTime[i] <= 109
1 <= profit[i] <= 104


solution:
```
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int numJobs = profit.length;
        Job[] jobs = new Job[numJobs];

        for (int i = 0; i < numJobs; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, Comparator.comparingInt(job -> job.endTime));
        int[] dp = new int[numJobs + 1];

        for (int i = 1; i <= numJobs; i++) {
            int endTimeValue = jobs[i - 1].endTime;
            int startTimeValue = jobs[i - 1].startTime;
            int profitValue = jobs[i - 1].profit;

            int latestNonConflictJobIndex = upperBound(jobs, i - 1, startTimeValue);
            dp[i] = Math.max(dp[i - 1], dp[latestNonConflictJobIndex] + profitValue);
        }
        return dp[numJobs];
    }

    private int upperBound(Job[] jobs, int endIndex, int targetTime) {
        int low = 0;
        int high = endIndex;
        while (low < high) {
            int mid = (low + high) / 2;
            if (jobs[mid].endTime <= targetTime) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static class Job {
        int startTime;
        int endTime;
        int profit;

        public Job(int startTime, int endTime, int profit) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
    }
}
```



other:
This problem involves the concept of dynamic programming and binary search.

1. **Dynamic Programming (DP):**
   - The problem is solved using dynamic programming to find the maximum profit.
   - The `dp` array is used to store the maximum profit that can be obtained at each position.
   - The recurrence relation is defined to update the `dp` array by considering the maximum profit of including or excluding the current job.

2. **Sorting:**
   - The jobs are sorted based on their end times. Sorting is done to efficiently find the latest non-conflicting job during dynamic programming.

3. **Binary Search:**
   - The `upperBound` function uses binary search to find the index of the latest non-conflicting job efficiently.
   - This binary search helps in optimizing the time complexity of the algorithm.

4. **Data Structure - Custom Class:**
   - A custom class `Job` is used to represent each job with attributes such as start time, end time, and profit.
   - The array of `Job` objects is used to store information about each job.

These concepts collectively contribute to solving the problem efficiently and finding the maximum profit by considering non-overlapping time ranges.



Certainly! Here's the basic logic for the given problem:

1. **Initialization:**
   - Create an array of custom objects (Job) to store information about each job (start time, end time, profit).
   - Sort the array of jobs based on their end times.

2. **Dynamic Programming Array (dp):**
   - Create a dynamic programming array (`dp`) to store the maximum profit at each position.
   - Initialize the first position of `dp` with zero.

3. **Dynamic Programming Loop:**
   - Iterate through each job starting from the first one.
   - For each job, find the latest non-conflicting job using binary search based on its start time.
   - Update the `dp` array at the current position by considering the maximum profit of either including or excluding the current job.

4. **Final Result:**
   - The maximum profit is the maximum value in the `dp` array.

The dynamic programming array is updated in a way that at each step, it considers the maximum profit that can be obtained by either including the current job or excluding it, while ensuring that there are no overlapping time ranges.

This logic ensures that the algorithm efficiently finds the maximum profit for non-overlapping jobs.




# Title
Maximum Non-Overlapping Jobs Profit

# Intuition
The idea is to use dynamic programming and binary search to find the maximum profit considering non-overlapping time ranges.

# Approach
1. Create a custom class `Job` to store information about each job.
2. Sort the array of jobs based on their end times.
3. Initialize a dynamic programming array (`dp`) to store the maximum profit at each position.
4. Iterate through each job, find the latest non-conflicting job using binary search, and update `dp` accordingly.
5. The maximum profit is the maximum value in the `dp` array.

# Complexity
- Time complexity: $$O(n \log n)$$ (due to sorting and binary search)
- Space complexity: $$O(n)$$