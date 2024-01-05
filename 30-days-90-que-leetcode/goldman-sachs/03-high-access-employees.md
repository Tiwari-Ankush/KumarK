problem:



soln:
```
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> result = new ArrayList<>();

        // Convert access times to a more manageable format
        List<AccessInfo> convertedTimes = new ArrayList<>();
        for (List<String> access : access_times) {
            String name = access.get(0);
            int time = Integer.parseInt(access.get(1));
            convertedTimes.add(new AccessInfo(name, time));
        }

        // Sort the access times based on employee names and converted time values
        Collections.sort(convertedTimes);

        // Map to track the one-hour period for each employee
        Map<String, OneHourPeriod> employeePeriods = new HashMap<>();

        // Iterate through the sorted access times
        for (AccessInfo accessInfo : convertedTimes) {
            String name = accessInfo.name;
            int time = accessInfo.time;

            // Get or create the one-hour period for the employee
            OneHourPeriod period = employeePeriods.computeIfAbsent(name, k -> new OneHourPeriod(time));

            // Count the number of access times within the one-hour period
            period.countAccess(time);
        }

        // Check for high-access employees
        for (Map.Entry<String, OneHourPeriod> entry : employeePeriods.entrySet()) {
            String name = entry.getKey();
            OneHourPeriod period = entry.getValue();

            // If an employee has three or more access times within the one-hour period, add them to the result
            if (period.accessCount >= 3) {
                result.add(name);
            }
        }

        return result;
    }

    // Helper class to store access information
    static class AccessInfo implements Comparable<AccessInfo> {
        String name;
        int time;

        AccessInfo(String name, int time) {
            this.name = name;
            this.time = time;
        }

        // Compare based on employee names and converted time values
        @Override
        public int compareTo(AccessInfo other) {
            int result = this.name.compareTo(other.name);
            if (result == 0) {
                result = Integer.compare(this.time, other.time);
            }
            return result;
        }
    }

    // Helper class to track one-hour period for each employee
    static class OneHourPeriod {
        int startTime;
        int accessCount;

        OneHourPeriod(int startTime) {
            this.startTime = startTime;
            this.accessCount = 0;
        }

        // Count the number of access times within the one-hour period
        void countAccess(int time) {
            if (time - startTime <= 100) { // Check if within one-hour period
                accessCount++;
            } else {
                // Move to a new one-hour period
                startTime = time;
                accessCount = 1;
            }
        }
    }
}
```