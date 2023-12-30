/*
      1
     12
    123
   1234
  12345
 */
public class Main07 {
    public static void main(String[] args) {
        int n = 5; // Set the number of rows

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - (i + 1)); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j < i + 2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
