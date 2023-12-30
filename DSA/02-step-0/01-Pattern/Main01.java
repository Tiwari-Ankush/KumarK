/*
 1.create  the given pattern 
000000
000000
000000
000000
*/

public class Main01 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 6;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
