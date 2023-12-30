
// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135

public class Main16 {
    public static void main(String[] args) {
        int n = 4;
        // Initialize 'n' with the desired value

        for (int i = 0; i < n; i++) {
            for (int j = 2 * i + 1; j < 2 * n; j += 2) {
                System.out.print(j + " ");
            }
            int a = 1;
            for (int k = 0; k < i; k++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}
