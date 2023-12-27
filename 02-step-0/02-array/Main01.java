// Introduction to Arrays

import java.util.*;
import java.io.*;

public class Main01 {
    public static void main(String args[]) {
        int[] array = new int[5]; // Create an integer array of size 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers, one at a time:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the contents of the array
        System.out.println("You entered the following integers:");
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
