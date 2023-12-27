
// ---1 0 to <3 spaces
// --232 0 to <2 spaces
// -34543
// 4567654

public class Main09 {
    public static void main(String[] args) {
        int n = 5; // Set the number of rows
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(".");
            }
            for (int j = i + 1; j <= 2 * i + 1; j++) {
                System.out.print(j);
            }
            // 2nd loop
            for (int j = 2 * i; j >= i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
