// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15

public class Main13 {
    public static void main(String[] args) {
        int n = 5; // assuming n is defined somewhere
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
                if (j < i + 1) {
                    System.out.print("+");
                }
                sum += j;
            }
            System.out.println("=" + sum);
        }
    }
}
