// sum of even numbers and odd numbers in a array

import java.util.*;
import java.io.*;
public class Main04 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        int sumvalue=0;
        for(int i=0;i<n;i++)
            {
                if(arr[i]%2!=0)
                   {
                       sumvalue+=arr[i];
                       System.out.println(sumvalue);
                   }
                else{
                      continue;
                }
            }
        System.out.print(sumvalue);
    }
}