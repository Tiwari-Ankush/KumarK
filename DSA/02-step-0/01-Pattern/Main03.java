/*
 * for n=3
 * pattern is
 * 1
 * 2 2
 * 3 3 3
 */

public class Main03 {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
