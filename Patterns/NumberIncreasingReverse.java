/*  Que- Number Increasing Reverse

    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4 
    1 2 3
    1 2
    1


*/


package Patterns;

import java.util.Scanner;

public class NumberIncreasingReverse {
    
    public void NumberPyramidReverse(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("\n");

        NumberIncreasingReverse obj=new NumberIncreasingReverse();

        obj.NumberPyramidReverse(n);
    }
}
