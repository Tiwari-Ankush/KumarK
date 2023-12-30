/*
 * ---*
 * --***
 * -*****
 * #######
 * -*****
 * --***
 * ---*
 * 
 */

public class Main10 {
    public static void main(String[] args) {
        int n = 10;
        int x = (n / 2) + 1;

        // First part
        for (int i = 0; i < x; i++) {
            for (int j = 1; j <= x - i - 1; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part
        for (int i = 1; i < x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(".");
            }
            for (int j = 0; j <= n - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// output if n=10
// ..........*
// .........***
// ........*****
// .......*******
// ......*********
// .....***********
// ....*************
// ...***************
// ..*****************
// .*******************
// ..*****************
// ...***************
// ....*************
// .....***********
// ......*********
// .......*******
// ........*****
// .........***
// ...........
