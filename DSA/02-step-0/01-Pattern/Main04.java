/*

A
BB
CCC

 * Input format :
 * Integer N (Total no. of rows)
 * 
 * 
 * Output format :
 * Pattern in N lines
 * 
 */

import java.util.*;
import java.io.*;

public class Main04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + i) + " ");
            }
            System.out.println();
        }
    }
}
