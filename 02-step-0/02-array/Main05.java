// sum of all pairs in an array

public class Main05 {
    public static void main(String args[]) {
        int arr[] = { 3, 4, 9, 7, 6 };
        for (int i = 0; i < 5; i++) {
            int sum;
            for (int j = i + 1; j < 5; j++) {
                sum = arr[i] + arr[j];
                System.out.println("Pairsum as " + " " + i + "th index + " + j + "th index " + sum);
            }
        }
    }
}