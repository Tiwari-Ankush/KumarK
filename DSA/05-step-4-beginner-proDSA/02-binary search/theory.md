lower bound and upper boound:

-> Given a sorted array of size “N”; find the index of the number in the array which is just greater than x and as close as possible to x.

-> Upper Bound (x) = Returns index of the number which is just greater than x and as close as possible to x.


intuative approach:
_Lower Bound (First Occurrence):

Initialize low and high pointers to the start and end of the array.
While low is less than or equal to high:
Calculate mid.
If the element at mid is less than the target, update low to mid + 1.
If the element at mid is greater than or equal to the target, update high to mid - 1.
If the element at mid equals the target, store mid and update high to mid - 1.
Return the stored index.
Upper Bound (Last Occurrence):

Initialize low and high pointers to the start and end of the array.
While low is less than or equal to high:
Calculate mid.
If the element at mid is less than or equal to the target, update low to mid + 1.
If the element at mid is greater than the target, update high to mid - 1.
If the element at mid equals the target, store mid and update low to mid + 1.
Return the stored index._

java code
```
public class Main {
    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
 
        while (left < right) {
            int mid = left + (right - left) / 2;
 
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
 
        return left;
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6 , 6, 7, 7, 9};
        int target = 6;
        int upperBoundIndex = upperBound(arr, target);
 
        if (upperBoundIndex < arr.length) {
            System.out.println("Upper bound of " + target + " is at index " + upperBoundIndex);
        } else {
            System.out.println("Upper bound of " + target + " is not found in the array. n = " + arr.length);
        }
    }
}
 
```