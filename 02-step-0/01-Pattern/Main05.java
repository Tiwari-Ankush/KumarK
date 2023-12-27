/*
 * 
 *
 * A
 * B C
 * C D E
 * D E F G
 * 
 * 0
 * 1 2
 * 2 3 4
 * 3 4 5 6
 */

public class Main05 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j <= 2 * i; j++) {
                // System.out.print(j);
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
}