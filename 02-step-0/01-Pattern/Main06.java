/*
 * H
 * G H
 * F G H
 * E F G H
 * D E F G H
 * C D E F G H
 * B C D E F G H
 * A B C D E F G H
 * 
 */

public class Main06 {
    public static void main(String[] args) {
        int n = 5; // Set the number of rows

        // Nested loops to generate the pattern
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                // System.out.print(j);
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
}
