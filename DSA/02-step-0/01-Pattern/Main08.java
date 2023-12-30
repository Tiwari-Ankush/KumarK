/*
 55555
 4444
 333
 22
 1
 */

public class Main08 {
    public static void main(String[] args) {
        int n = 6; // Set the number of rows

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - (i + 1)); j++) {
                System.out.print(n - i - 1);
            }
            System.out.println();
        }

    }
}
