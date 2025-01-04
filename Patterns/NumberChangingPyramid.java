/*  Que- Number Changing Pyramid

    1
    2  3
    4  5  6
    7  8  9  10
    11  12  13  14  15
    16  17  18  19  20  21
    22  23  24  25  26  27  28 
 
 */


package Patterns;

import java.util.Scanner;

public class NumberChangingPyramid {
    public void NumberChangePyramid(int n) {
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("\n");

        NumberChangingPyramid obj=new NumberChangingPyramid();

        obj.NumberChangePyramid(n);
    }
}
