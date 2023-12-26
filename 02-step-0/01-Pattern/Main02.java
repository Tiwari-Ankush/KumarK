/*
 * 2.create the given pattern
 * 0
 * 00
 * 000
 * 0000
 * 
 */

public class Main02 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
